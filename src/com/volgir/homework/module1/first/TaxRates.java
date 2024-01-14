package com.volgir.homework.module1.first;

public enum TaxRates {
    TAX_RATE_BEFORE_MILLION(0.08, 1_000_000),
    TAX_RATE_BEFORE_TWO_MILLION(0.10, 2_000_000),
    TAX_RATE_AFTER_TWO_MILLION(0.13, Long.MAX_VALUE);

    private double taxRate;
    private long limit;

    TaxRates(double taxRate, long limit) {
        this.taxRate = taxRate;
        this.limit = limit;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public long getLimit() {
        return limit;
    }
}
