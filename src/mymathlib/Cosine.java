package mymathlib;

public class Cosine implements MathOperation {
    @Override
    public double calculate(double... args) {
        if (args.length == 0) throw new IllegalArgumentException("Argument kerak");
        double x = args[0];

        // x ni 0-2π oralig'iga keltirish
        double PI = 3.14159265358979323846;
        while (x > 2 * PI) x -= 2 * PI;
        while (x < 0) x += 2 * PI;

        // Taylor seriyasi: cos(x) = 1 - x^2/2! + x^4/4! - x^6/6! + ...
        double result = 1.0;
        double term = 1.0;

        for (int n = 1; n < 50; n++) {
            term *= -x * x / ((2 * n - 1) * (2 * n));
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
        return "cos";
    }
}
