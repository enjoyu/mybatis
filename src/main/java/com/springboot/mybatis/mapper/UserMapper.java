package com.springboot.mybatis.mapper;

import com.springboot.mybatis.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper //声明UserMapper为一个Mapper接口
public interface UserMapper {
    /*@Result是结果映射列表
    property是User类的属性名，colomn是数据库表的字段名
     */
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age")
    })

    //插入用户
    @Insert("INSERT INTO user(name, age) VALUES (#{name}, #{age})")
    void insert(User user);

    //根据年龄查询用户
    @Select("SELECT * FROM user WHERE age = #{age}")
    List<User> select(int age);
}



