package mymathlib;

public class NaturalLogarithm implements  MathOperation {
    @Override
    public double calculate(double... args) {
        if (args.length == 0) throw new IllegalArgumentException("Argument kerak");
        double x = args[0];
        if (x <= 0) throw new IllegalArgumentException("Logarifm uchun musbat son kerak");

        // ln(x) ni hisoblash uchun Taylor seriyasi
        // x ni 1 yaqiniga keltirish
        int exponent = 0;
        while (x > 2.0) {
            x /= 2.718281828459045; // e
            exponent++;
        }
        while (x < 0.5) {
            x *= 2.718281828459045; // e
            exponent--;
        }

        // ln(x) Taylor seriyasi: ln(1+y) = y - y^2/2 + y^3/3 - y^4/4 + ...
        double y = x - 1.0;
        double result = 0.0;
        double term = y;

        for (int n = 1; n < 100; n++) {
            if (n % 2 == 1) {
                result += term / n;
            } else {
                result -= term / n;
            }
            term *= y;
            if (absDouble(term / n) < 1e-15) break;
        }

        return result + exponent;
    }

    private double absDouble(double x) {
        return x < 0 ? -x : x;
    }

    @Override
    public String getName() {
        return "log";
    }
}
