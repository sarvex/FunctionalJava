package com.sarvex.functional;

/**
 * Created by Sarvex on 23/03/2015.
 */
abstract class PolynomialQuantity implements QuantityOfInterest {

    private final double[] coefficients;

    protected PolynomialQuantity(final double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public double valueAt(final int time) {
        double result = 0.0;

        for (int i = 0; i < coefficients.length; i++) {
            result += coefficients[i] * Math.pow(time, i);
        }

        return result;
    }
}
