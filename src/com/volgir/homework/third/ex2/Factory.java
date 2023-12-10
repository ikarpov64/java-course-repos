package com.volgir.homework.third.ex2;

import com.volgir.homework.third.ex2.components.Cam;
import com.volgir.homework.third.ex2.components.Mainboard;
import com.volgir.homework.third.ex2.components.Os;

public class Factory {
    public void buildPhone(Iphone iphone) {
        iphone.mainboard = new Mainboard("7uik", "15х12х13");
        iphone.cam = new Cam(15, true);
        iphone.os = new Os("Ios");
    }

    public void buildPhone(Samsung samsung) {
        samsung.mainboard = new Mainboard("j-108", "10х12х13");;
        samsung.cam = new Cam(20, false);
        samsung.os = new Os("Android");
    }
}
