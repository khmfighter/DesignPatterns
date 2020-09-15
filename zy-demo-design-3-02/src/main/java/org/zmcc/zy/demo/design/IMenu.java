package org.zmcc.zy.demo.design;

/**
 * @ClassName IMenu.java
 * @Author khuaming
 * @Version 1.0.0
 * @Description TODO
 * @CreateTime 2020年09月14日 14:52:00
 **/
public interface IMenu {
    IMenu appendCeiling(Matter matter); // 吊顶

    IMenu appendCoat(Matter matter);    // 涂料

    IMenu appendFloor(Matter matter);   // 地板

    IMenu appendTile(Matter matter);    // 地砖

    String getDetail();                 // 明细
}
