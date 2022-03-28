//package com.wys;
//
//import com.wys.mapper.UserMapper;
//import com.wys.pojo.User;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//
//@SpringBootTest
//class SpringbootInitApplicationTests {
//
//    @Autowired
//    private UserMapper userMapper;
//
//    @Test
//    void contextLoads() {
//        // 参数是一个 Wrapper，条件构造器，这里先使用 null
//        List<User> users = userMapper.selectList(null);
//        users.forEach(System.out::println);
//    }
//
//    @Test
//    public void testInsert() {
//        User user = new User();
//        user.setName("王叶盛");
//        user.setAge(19);
//        user.setEmail("2667009323@qq.com");
//        int insert = userMapper.insert(user);
//        System.out.println(insert);
//        System.out.println(user);
//    }
//
//    @Test
//    public void testUpdate() {
//        User user = new User();
//        user.setId(6L);
//        user.setAge(50);
//        int i = userMapper.updateById(user);
//        System.out.println(i);
//
//    }
//}
