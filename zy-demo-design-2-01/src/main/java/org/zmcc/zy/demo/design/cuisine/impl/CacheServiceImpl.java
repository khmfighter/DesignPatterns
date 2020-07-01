package org.zmcc.zy.demo.design.cuisine.impl;

import org.zmcc.zy.demo.design.CacheService;
import org.zmcc.zy.demo.design.RedisUtils;
import org.zmcc.zy.demo.design.matter.EGM;
import org.zmcc.zy.demo.design.matter.IIR;

import java.util.concurrent.TimeUnit;

/**
 * @author khuaming
 * @version 1.0.0
 * @ClassName CacheServiceImpl.java
 * @Description TODO
 * @createTime 2020年06月30日 17:41:00
 **/
public class CacheServiceImpl implements CacheService {
    private RedisUtils redisUtils = new RedisUtils();
    private EGM egm = new EGM();
    private IIR iir = new IIR();

    @Override
    public String get(String key, int redisType) {
        if (1 == redisType) {
            return egm.gain(key);
        }
        if (2 == redisType) {
            return iir.get(key);
        }
        return redisUtils.get(key);
    }
    @Override
    public void set(String key, String value, int redisType) {
        if (1 == redisType) {
            egm.set(key, value);
            return;
        }
        if (2 == redisType) {
            iir.set(key, value);
            return;
        }
        redisUtils.set(key, value);
    }
    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType) {
        if (1 == redisType) {
            egm.setEx(key, value, timeout, timeUnit);
            return;
        }
        if (2 == redisType) {
            iir.setExpire(key, value, timeout, timeUnit);
            return;
        }
        redisUtils.set(key, value, timeout, timeUnit);
    }
    @Override
    public void del(String key, int redisType) {
        if (1 == redisType) {
            egm.delete(key);
            return;
        }
        if (2 == redisType) {
            iir.del(key);
            return;
        }
        redisUtils.del(key);
    }
}
