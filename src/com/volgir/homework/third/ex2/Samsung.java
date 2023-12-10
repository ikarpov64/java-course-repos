package com.volgir.homework.third.ex2;

import java.util.Arrays;

public class Samsung {
    private String os;
    private Object[] samsungParts;

    @Override
    public String toString() {
        return "Samsung{" +
                "os='" + os + '\'' +
                ", samsungParts=" + Arrays.toString(samsungParts) +
                '}';
    }
}
