package com.supalle.bothcachedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.redis.core.RedisOperations;

/**
 * @author Supalle
 */
@EnableCaching
@ConditionalOnClass(RedisOperations.class)
@EnableConfigurationProperties(RedisProperties.class)
@SpringBootApplication
public class BothCacheDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BothCacheDemoApplication.class, args);
    }

}
