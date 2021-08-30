package com.supalle.bothcachedemo.service.impl;

import com.supalle.bothcachedemo.model.User;
import com.supalle.bothcachedemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author Supalle
 */
@Service
@CacheConfig(cacheNames = "user")
// Or set on CacheConfig
// @CacheConfig(cacheNames = "user", cacheResolver = "bothCacheResolver")
public class UserServiceImpl implements UserService {

    private static final Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);

    /**
     * cacheResolver="bothCacheResolver"
     */
    @Cacheable(key = "#p0", cacheResolver = "bothCacheResolver")
    @Override
    public User findByUserName(String username) {

        // no cache
        // find user from database
        final User user = new User();
        user.setUsername("supalle");
        user.setPassword("123");
        user.setAge(18);
        user.setEmail("supalle@qq.com");
        user.setFirstname("Lino");
        user.setLastname("Supalle");

        LOG.info("find user from database:{}", user);

        return user;
    }

}
