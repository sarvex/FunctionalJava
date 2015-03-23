package com.sarvex.object;

/**
 * Created by Sarvex on 23/03/2015.
 */
abstract class MonthByMonthQuantity implements QuantityOfInterest {

    private final double[] values;

    protected MonthByMonthQuantity(final double[] values) {
        this.values = values;
    }

    @Override
    public double valueAt(final int time) {
        return values[time - 1];
    }
}
