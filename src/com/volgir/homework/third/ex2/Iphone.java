package com.volgir.homework.third.ex2;

import com.volgir.homework.third.ex2.components.Cam;
import com.volgir.homework.third.ex2.components.Mainboard;
import com.volgir.homework.third.ex2.components.Os;

public class Iphone extends Phone {

    public Iphone() {}

    public void setCam(Cam cam) {
        this.cam = cam;
    }

    public void setMainboard(Mainboard mainboard) {
        this.mainboard = mainboard;
    }

    public void setOs(Os os) {
        this.os = os;
    }
}
