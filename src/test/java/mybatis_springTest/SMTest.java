package mybatis_springTest;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.whut.mybatis_spring.entity.User;
import org.whut.mybatis_spring.mapper.UserMapper;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-11-8
 * Time: 下午7:52
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/META_INF/spring/beans.xml")
public class SMTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testAdd(){

        User user = new User(-1,"tom",new Date(),12345);
        userMapper.save(user);
    }


}
