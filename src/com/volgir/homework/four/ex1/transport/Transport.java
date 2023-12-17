package com.volgir.homework.four.ex1.transport;

import java.security.cert.TrustAnchor;

public abstract class Transport {
    private boolean isClear;
    private final double width;
    private final double height;
    private final double length;

    public Transport(boolean isClear, double width, double height, double length) {
        this.isClear = isClear;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void setClear() {
        isClear = true;
    }

    public boolean isClear() {
        return isClear;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Transport{"
                + "isClear=" + isClear
                + ", width=" + width
                + ", height=" + height
                + ", length=" + length
                + '}';
    }
}
