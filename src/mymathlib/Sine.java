package mymathlib;

public class Sine implements MathOperation{
    @Override
    public double calculate(double... args) {
        if (args.length == 0) throw new IllegalArgumentException("Argument kerak");
        double x = args[0];

        // x ni 0-2π oralig'iga keltirish
        double PI = 3.14159265358979323846;
        while (x > 2 * PI) x -= 2 * PI;
        while (x < 0) x += 2 * PI;

        // Taylor seriyasi: sin(x) = x - x^3/3! + x^5/5! - x^7/7! + ...
        double result = 0.0;
        double term = x;

        for (int n = 0; n < 50; n++) {
            if (n % 2 == 0) {
                result += term;
            } else {
                result -= term;
            }
            term *= x * x / ((2 * n + 2) * (2 * n + 3));
            if (absDouble(term) < 1e-15) break;
        }

        return result;
    }

    private double absDouble(double x) {
        return x < 0 ? -x : x;
    }

    @Override
    public String getName() {
        return "sin";
    }
}
