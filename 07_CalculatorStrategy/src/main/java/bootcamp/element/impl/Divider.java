package bootcamp.element.impl;

import bootcamp.element.ProcessingElement;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Divider implements ProcessingElement {
    @Override
    public BigDecimal process(BigDecimal x, BigDecimal y) throws ArithmeticException {
        return x.divide(y, 2, RoundingMode.HALF_DOWN);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) {
            return false;
        }
        return getClass() == obj.getClass();
    }
}
