package com.volgir.homework.third.ex2;

import com.volgir.homework.third.ex2.components.Cam;
import com.volgir.homework.third.ex2.components.Mainboard;
import com.volgir.homework.third.ex2.components.Os;

public class Factory {
    public void buildPhone(Iphone iphone) {
        iphone.setMainboard(new Mainboard("7uik", "15х12х13"));
        iphone.setCam(new Cam(15, true));
        iphone.setOs(new Os("Ios"));
    }

    public void buildPhone(Samsung samsung) {
        samsung.setMainboard(new Mainboard("j-108", "10х12х13"));
        samsung.setCam(new Cam(20, false));
        samsung.setOs(new Os("Android"));
    }
}
