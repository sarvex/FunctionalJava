package com.sarvex.object;

/**
 * Created by Sarvex on 23/03/2015.
 */
public class IncrementalCosts extends PolynomialQuantity {

    public IncrementalCosts(final double intercept, final double slope) {
        super(new double[]{intercept, slope});
    }

    @Override
    public String getName() {
        return ("Incremental Costs");
    }
}
