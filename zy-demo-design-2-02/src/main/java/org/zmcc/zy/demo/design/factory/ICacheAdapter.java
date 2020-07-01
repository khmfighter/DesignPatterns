package org.zmcc.zy.demo.design.factory;

import java.util.concurrent.TimeUnit;

/**
 * @author khuaming
 * @version 1.0.0
 * @ClassName ICacheAdapter.java
 * @Description TODO
 * @createTime 2020年06月30日 18:04:00
 **/
public interface ICacheAdapter {
    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
