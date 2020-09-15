package org.zmcc.zy.demo.design.tile;

import org.zmcc.zy.demo.design.Matter;

import java.math.BigDecimal;

/**
 * @ClassName MarcoPoloTile.java
 * @Author khuaming
 * @Version 1.0.0
 * @Description 马可波罗(MARCO POLO)
 * @CreateTime 2020年09月14日 14:31:00
 **/
public class MarcoPoloTile implements Matter {
    @Override
    public String scene() {
        return "地砖";
    }

    @Override
    public String brand() {
        return "马可波罗(MARCO POLO)";
    }

    @Override
    public String model() {
        return "缺省";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(140);
    }

    @Override
    public String desc() {
        return "马可波罗”品牌诞生于1996年，作为国内最早品牌化的建陶品牌，以“文化陶瓷”占领市场，享有“仿古砖至尊”的美誉。";
    }
}
