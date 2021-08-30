package com.supalle.bothcachedemo.service;

import com.supalle.bothcachedemo.model.User;

/**
 * @author Supalle
 */
public interface UserService {

    User findByUserName(String username);

}
