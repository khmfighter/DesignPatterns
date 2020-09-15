package org.zmcc.zy.demo.design.test;

import org.junit.Test;
import org.zmcc.zy.demo.design.Builder;

/**
 * @ClassName ApiTest.java
 * @Author khuaming
 * @Version 1.0.0
 * @Description TODO
 * @CreateTime 2020年09月14日 15:10:00
 **/
public class ApiTest {
    @Test
    public void test_Builder(){
        Builder builder = new Builder();
        // 豪华欧式
        System.out.println(builder.levelOne(132.52D).getDetail());
        // 轻奢田园
        System.out.println(builder.levelTwo(98.25D).getDetail());
        // 现代简约
        System.out.println(builder.levelThree(85.43D).getDetail());
    }
}
