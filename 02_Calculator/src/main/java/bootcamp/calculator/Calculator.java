package bootcamp.calculator;

import bootcamp.data.Params;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {
    public BigDecimal calculate(final Params params) {

        BigDecimal result = new BigDecimal(0);
        BigDecimal x = params.getX();
        BigDecimal y = params.getY();
        String operator = params.getOperator();

        if(operator.equals("+")) {
            result = x.add(y);
        } else if (operator.equals("-")) {
            result = x.subtract(y);
        } else if (operator.equals("x")) {
            result = x.multiply(y);
        } else if (operator.equals("/")) {
            result = x.divide(y);
        } else {
            throw new IllegalArgumentException();
        }

        return result.setScale(1, RoundingMode.FLOOR).stripTrailingZeros();
    }
}
