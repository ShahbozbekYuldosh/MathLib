package mymathlib;

public class ArcTangent implements MathOperation {
    @Override
    public double calculate(double... args) {
        if (args.length == 0) throw new IllegalArgumentException("Argument kerak");
        double x = args[0];

        // Katta qiymatlar uchun formulalardan foydalanish
        if (x > 1) {
            double PI = 3.14159265358979323846;
            return PI / 2.0 - atanSmall(1.0 / x);
        } else if (x < -1) {
            double PI = 3.14159265358979323846;
            return -PI / 2.0 - atanSmall(1.0 / x);
        }

        return atanSmall(x);
    }

    private double atanSmall(double x) {
        // Taylor seriyasi: atan(x) = x - x^3/3 + x^5/5 - x^7/7 + ...
        double result = 0;
        double term = x;
        double x2 = x * x;

        for (int n = 0; n < 100; n++) {
            double divisor = 2 * n + 1;
            if (n % 2 == 0) {
                result += term / divisor;
            } else {
                result -= term / divisor;
            }
            term *= x2;
            if (absDouble(term / divisor) < 1e-15) break;
        }

        return result;
    }

    private double absDouble(double x) {
        return x < 0 ? -x : x;
    }

    @Override
    public String getName() {
        return "atan";
    }
}
