package org.zmcc.zy.demo.design.test;

import org.junit.Test;
import org.zmcc.zy.demo.design.CacheService;
import org.zmcc.zy.demo.design.cuisine.impl.CacheServiceImpl;

/**
 * @author khuaming
 * @version 1.0.0
 * @ClassName ApiTest.java
 * @Description TODO
 * @createTime 2020年06月30日 17:54:00
 **/
public class ApiTest {
    @Test
    public void test_CacheService() {

        CacheService cacheService = new CacheServiceImpl();

        cacheService.set("user_name_01", "小傅哥", 1);
        String val01 = cacheService.get("user_name_01", 1);
        System.out.println("测试结果：" + val01);
    }
}
