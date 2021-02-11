package bootcamp.app;

import bootcamp.calculator.Calculator;
import bootcamp.data.Params;

import java.math.BigDecimal;

public class CalculatorApp {
    public static void main(final String[] args) {
        Params params = new Params(new BigDecimal(args[0]), new BigDecimal(args[1]), args[2]);
        Calculator calculator = new Calculator();
        BigDecimal result = calculator.calculate(params);

        System.out.println(args[0] + args[2] + args[1] + "=" + result);
    }
}
