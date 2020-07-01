package org.zmcc.zy.demo.design.impl;

import org.zmcc.zy.demo.design.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * @author khuaming
 * @version 1.0.0
 * @ClassName CacheServiceImpl.java
 * @Description TODO
 * @createTime 2020年06月30日 18:03:00
 **/
public class CacheServiceImpl {
    private RedisUtils redisUtils = new RedisUtils();

    public String get(String key) {
        return redisUtils.get(key);
    }

    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        redisUtils.del(key);
    }
}
