package azuray.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import azuray.dao.UserDao;
import azuray.entity.User;
import azuray.service.IUserService;

@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserDao,User> implements IUserService {

//    @Autowired
//    private UserDao userDao;
//
//    public User getUserInfoByCode(String userCode) {
//        userDao.
//        return null;
//    }
}
