/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dip.domain;

import java.util.List;

/**
 *
 * @author stan
 */
public interface UsersDAO {
    Users getById(int id);
    Users getByUsernameAndPassword(String username, String password);
    List<Users> getList();
    Users findByUsername(String username);
}
