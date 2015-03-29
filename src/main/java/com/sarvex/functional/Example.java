package com.sarvex.functional;

/**
 * Created by Sarvex on 23/03/2015.
 */
public class Example {

    final static double[] EXPECTED_SALES_JAN_TO_DEC =
            new double[]{42.0, 45.6, 43.6, 50.2, 55.6, 54.7,
                    58.0, 57.3, 62.0, 60.3, 71.2, 88.8};

    public static void main(final String[] args) {

        final FunctionOverTime sales = FunctionOverTime.monthByMonth(EXPECTED_SALES_JAN_TO_DEC);

        final FunctionOverTime fixedCosts = FunctionOverTime.constant(15.0);
        final FunctionOverTime incrementalCosts = FunctionOverTime.line(5.1, 0.15);

        final FunctionOverTime profit = (time) -> sales.valueAt(time)
                - (fixedCosts.valueAt(time) + incrementalCosts.valueAt(time));

        double total = 0.0;

        for (int i = 1; i <= 12; i++) {
            total += profit.valueAt(i);
        }

        System.out.println("Total profits for the year: " + total);
    }
}
