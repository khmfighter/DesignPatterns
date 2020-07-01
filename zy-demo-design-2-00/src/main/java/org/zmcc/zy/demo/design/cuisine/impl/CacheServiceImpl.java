package org.zmcc.zy.demo.design.cuisine.impl;

import org.zmcc.zy.demo.design.CacheService;
import org.zmcc.zy.demo.design.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * @author khuaming
 * @version 1.0.0
 * @ClassName CacheServiceImpl.java
 * @Description TODO
 * @createTime 2020年06月30日 17:16:00
 **/
public class CacheServiceImpl implements CacheService {
    private RedisUtils redisUtils = new RedisUtils();
    @Override
    public String get(String key) {
        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        redisUtils.del(key);
    }
}
