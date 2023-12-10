package com.volgir.homework.third.ex2;

import com.volgir.homework.third.ex2.components.Cam;
import com.volgir.homework.third.ex2.components.Mainboard;
import com.volgir.homework.third.ex2.components.Os;


public class Runner {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        Cam iphoneCam = new Cam(15, true);
        Mainboard iphoneMainboard = new Mainboard("7uik", "15х12х13");
        Os iphoneOs = new Os("Ios");


        Factory myFactory = new Factory();
        myFactory.buildPhone(iphone, iphoneCam, iphoneMainboard, iphoneOs);
    }
}
