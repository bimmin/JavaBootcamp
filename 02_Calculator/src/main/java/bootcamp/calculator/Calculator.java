package bootcamp.calculator;

import bootcamp.data.Params;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {
    public BigDecimal calculate(final Params params) {

        BigDecimal x = params.getX();
        BigDecimal y = params.getY();
        String operator = params.getOperator();
        BigDecimal result = new BigDecimal(0);

        switch (operator) {
            case "+":
                result = x.add(y);
                break;
            case "-":
                result = x.subtract(y);
                break;
            case "x":
                result = x.multiply(y);
                break;
            case "/":
                result = x.divide(y);
                break;
            default: throw new IllegalArgumentException("Invalid Operator");
        }

        return result.setScale(1, RoundingMode.FLOOR).stripTrailingZeros();
    }
}
