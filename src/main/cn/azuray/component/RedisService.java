package azuray.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

import azuray.Exception.ProjectRuntimeExcption;

@Component
public class RedisService {

    @Autowired
    private StringRedisTemplate template;

    public void set(String key, String value) {
        try {
            template.opsForValue().set(key, value);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ProjectRuntimeExcption("9999", "缓存放入失败");
        }
    }

    public void set(String key, String value, Long time) {
        try {
            template.opsForValue().set(key, value,time, TimeUnit.MINUTES);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ProjectRuntimeExcption("9999", "缓存放入失败");
        }
    }

    public String get(String key) {
        try {
           return template.opsForValue().get(key);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ProjectRuntimeExcption("9999", "缓存取出失败");
        }
    }

    public void remove(String key) {
        try {
            template.delete(key);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ProjectRuntimeExcption("9999", "缓存删除失败");
        }
    }
}
