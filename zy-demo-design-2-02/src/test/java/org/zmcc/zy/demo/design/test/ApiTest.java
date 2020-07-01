package org.zmcc.zy.demo.design.test;

import org.junit.Test;
import org.zmcc.zy.demo.design.CacheService;
import org.zmcc.zy.demo.design.cuisine.impl.CacheServiceImpl;
import org.zmcc.zy.demo.design.factory.JDKProxy;
import org.zmcc.zy.demo.design.factory.impl.EGMCacheAdapter;
import org.zmcc.zy.demo.design.factory.impl.IIRCacheAdapter;

/**
 * @author khuaming
 * @version 1.0.0
 * @ClassName ApiTest.java
 * @Description TODO
 * @createTime 2020年06月30日 18:14:00
 **/
public class ApiTest {
    @Test
    public void test_CacheService() throws Exception {

        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01", "小傅哥");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println("测试结果：" + val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01", "小傅哥");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println("测试结果：" + val02);

    }
}
