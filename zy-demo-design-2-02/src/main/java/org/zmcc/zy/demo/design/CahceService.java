package org.zmcc.zy.demo.design;

import java.util.concurrent.TimeUnit;

/**
 * @author khuaming
 * @version 1.0.0
 * @ClassName CahceService.java
 * @Description TODO
 * @createTime 2020年06月30日 18:00:00
 **/
public interface CahceService {
    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
