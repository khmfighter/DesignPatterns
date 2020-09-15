package org.zmcc.zy.demo.design.test;

import org.junit.Test;
import org.zmcc.zy.demo.design.DecorationPackageController;

import java.math.BigDecimal;

/**
 * @ClassName ApiTest.java
 * @Author khuaming
 * @Version 1.0.0
 * @Description TODO
 * @CreateTime 2020年09月14日 15:11:00
 **/
public class ApiTest {
    @Test
    public void test_DecorationPackageController(){
        DecorationPackageController decoration = new DecorationPackageController();
        // 豪华欧式
        System.out.println(decoration.getMatterList(new BigDecimal("132.52"),1));
        // 轻奢田园
        System.out.println(decoration.getMatterList(new BigDecimal("98.25"),2));
        // 现代简约
        System.out.println(decoration.getMatterList(new BigDecimal("85.43"),3));
    }
}
