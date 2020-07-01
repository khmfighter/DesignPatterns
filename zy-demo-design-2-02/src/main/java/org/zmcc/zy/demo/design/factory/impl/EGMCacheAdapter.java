package org.zmcc.zy.demo.design.factory.impl;

import org.zmcc.zy.demo.design.factory.ICacheAdapter;
import org.zmcc.zy.demo.design.matter.EGM;

import java.util.concurrent.TimeUnit;

/**
 * @author khuaming
 * @version 1.0.0
 * @ClassName EGMCacheAdapter.java
 * @Description TODO
 * @createTime 2020年06月30日 18:10:00
 **/
public class EGMCacheAdapter implements ICacheAdapter {
    private EGM egm = new EGM();
    @Override
    public String get(String key) {
        return egm.gain(key);
    }

    @Override
    public void set(String key, String value) {
        egm.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        egm.delete(key);
    }
}
