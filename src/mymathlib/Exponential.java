package mymathlib;

public class Exponential implements MathOperation {
    @Override
    public double calculate(double... args) {
        if (args.length == 0) throw new IllegalArgumentException("Argument kerak");
        double x = args[0];

        // Taylor seriyasi: e^x = 1 + x + x^2/2! + x^3/3! + ...
        double result = 1.0;
        double term = 1.0;

        for (int n = 1; n < 100; n++) {
            term *= x / n;
            result += term;
            if (absDouble(term) < 1e-15) break;
        }

        return result;
    }

    private double absDouble(double x) {
        return x < 0 ? -x : x;
    }

    @Override
    public String getName() {
        return "exp";
    }
}
