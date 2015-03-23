package com.sarvex.functional;

/**
 * Created by Sarvex on 23/03/2015.
 */
public class FixedCosts extends PolynomialQuantity {

    public FixedCosts(double constant) {
        super(new double[]{constant});
    }

    @Override
    public String getName() {
        return ("Fixed Costs");
    }
}
