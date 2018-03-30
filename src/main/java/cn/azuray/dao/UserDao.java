package cn.azuray.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import org.springframework.stereotype.Repository;

import cn.azuray.entity.User;

@Repository
public interface UserDao extends BaseMapper<User> {
}
