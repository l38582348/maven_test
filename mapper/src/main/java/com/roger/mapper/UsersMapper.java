package com.roger.mapper;

import com.roger.pojo.Users;
import java.util.List;

/**
 * @Auther: Roger
 * @Date: 19/10/02
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */

public interface UsersMapper {

    void insertUser(Users users);
    List<Users> selectUserAll();
}
