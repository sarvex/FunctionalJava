package com.sarvex.functional;

/**
 * Created by Sarvex on 23/03/2015.
 */
public class Sales extends MonthByMonthQuantity {

    public Sales(final double[] values) {
        super(values);
    }

    @Override
    public String getName() {
        return ("Expected Sales");
    }
}
