package com.roger.service.impl;

import com.roger.mapper.UsersMapper;
import com.roger.pojo.Users;
import com.roger.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: Roger
 * @Date: 19/10/02
 * @Description: com.roger.service.impl
 * @version: 1.0
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

  //  @Override
    public void addUser(Users users) {
        this.usersMapper.insertUser(users);
    }
}
