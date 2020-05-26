package org.zmcc.chapter001.factory;

import org.zmcc.chapter001.buttons.Button;

/**
 * @author khuaming
 * @version 1.0.0
 * @ClassName Dialog.java
 * @Description TODO
 * @createTime 2020年05月26日 14:18:00
 **/
public abstract class Dialog {
    public void renderWindow(){
        Button okButton=createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
