package org.zmcc.zy.demo.design.factory.impl;

import org.zmcc.zy.demo.design.factory.ICacheAdapter;
import org.zmcc.zy.demo.design.matter.IIR;

import java.util.concurrent.TimeUnit;

/**
 * @author khuaming
 * @version 1.0.0
 * @ClassName IIRCacheAdapter.java
 * @Description TODO
 * @createTime 2020年06月30日 18:10:00
 **/
public class IIRCacheAdapter implements ICacheAdapter {
    private IIR iir = new IIR();
    @Override
    public String get(String key) {
        return iir.get(key);
    }

    @Override
    public void set(String key, String value) {
        iir.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        iir.del(key);
    }
}
