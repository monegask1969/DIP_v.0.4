/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dip.service;

import com.so.dip.domain.Users;
import java.util.List;

/**
 *
 * @author stan
 */
public interface UsersService {
    Users getById(int id);
    List<Users> getList();
    Users loadByUsername(String login);
}
