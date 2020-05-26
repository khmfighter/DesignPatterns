package org.zmcc.chapter001.factory;

import org.zmcc.chapter001.buttons.Button;
import org.zmcc.chapter001.buttons.WindowsButton;

/**
 * @author khuaming
 * @version 1.0.0
 * @ClassName WindowsDialog.java
 * @Description TODO
 * @createTime 2020年05月26日 14:20:00
 **/
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
