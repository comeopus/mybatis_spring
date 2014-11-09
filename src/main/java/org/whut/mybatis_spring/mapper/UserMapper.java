package org.whut.mybatis_spring.mapper;

import org.whut.mybatis_spring.entity.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-11-8
 * Time: 下午7:06
 * To change this template use File | Settings | File Templates.
 */
public interface UserMapper {

    void save(User user);
    void update(User user);
    void delete(int id);
    User findById(int id);
    List<User> findAll();
}
