package com.volgir.homework.four.ex1.transport;

public abstract class Transport {
    private boolean isClean;
    private final double width;
    private final double height;
    private final double length;

    public Transport(boolean isClean, double width, double height, double length) {
        this.isClean = isClean;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void setClean() {
        isClean = true;
    }

    public boolean isClean() {
        return isClean;
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
                + "isClear=" + isClean
                + ", width=" + width
                + ", height=" + height
                + ", length=" + length
                + '}';
    }
}
