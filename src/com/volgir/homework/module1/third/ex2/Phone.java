package com.volgir.homework.module1.third.ex2;

import com.volgir.homework.module1.third.ex2.components.Cam;
import com.volgir.homework.module1.third.ex2.components.Mainboard;
import com.volgir.homework.module1.third.ex2.components.Os;

public abstract class Phone {
    protected String model;
    protected Cam cam;
    protected Mainboard mainboard;
    protected Os os;

    public Phone(String model) {
        this.model = model;
    }

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
