package mymathlib;

public class ArcSine implements MathOperation {
    @Override
    public double calculate(double... args) {
        if (args.length == 0) throw new IllegalArgumentException("Argument kerak");
        double x = args[0];
        if (x < -1 || x > 1) {
            throw new IllegalArgumentException("Qiymat -1 va 1 orasida bo'lishi kerak");
        }

        // Taylor seriyasi: asin(x) = x + (1/6)x^3 + (3/40)x^5 + ...
        double result = x;
        double term = x;
        double x2 = x * x;

        for (int n = 1; n < 50; n++) {
            term *= x2 * (2 * n - 1) * (2 * n - 1) / ((2 * n) * (2 * n + 1));
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
        return "asin";
    }
}
