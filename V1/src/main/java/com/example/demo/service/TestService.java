package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.pojo.UserPojo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entry.ResultBody;

@Service
@Data
public class TestService {

    @Autowired
    UserDao dao;

    public ResultBody test(UserPojo user) {
        return ResultBody.success(dao.GetUserbyId(user));
    }
}
