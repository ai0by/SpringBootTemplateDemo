package com.example.demo.dao;

import java.util.List;
import com.example.demo.entry.UserEntry;
import com.example.demo.pojo.UserPojo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    List<UserEntry> GetUserbyId(UserPojo user);
}
