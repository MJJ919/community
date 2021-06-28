package com.example.community.mapper;

import com.example.community.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface UserMapper {
    void insert(User user);

    User findByToken(@Param("token") String token);

    User findById(@Param("id") Integer id);

    User findByAccountId(@Param("accountId")String accountId);

    void update(User dbUser);
}
