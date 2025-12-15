package mymathlib;

public class Power implements MathOperation {
    @Override
    public double calculate(double... args) {
        if (args.length < 2) throw new IllegalArgumentException("2 ta argument kerak");
        double base = args[0];
        double exponent = args[1];

        // Maxsus holatlar
        if (exponent == 0) return 1.0;
        if (base == 0) return 0.0;
        if (exponent == 1) return base;

        // Agar eksponent butun son bo'lsa
        if (exponent == (int) exponent) {
            return powerInt(base, (int) exponent);
        }

        // x^y = e^(y * ln(x))
        NaturalLogarithm ln = new NaturalLogarithm();
        Exponential exp = new Exponential();

        if (base < 0 && exponent != (int) exponent) {
            throw new IllegalArgumentException("Manfiy asosdan kasr darajaga ko'tarish mumkin emas");
        }

        return exp.calculate(exponent * ln.calculate(absDouble(base)));
    }

    private double powerInt(double base, int exp) {
        if (exp < 0) {
            return 1.0 / powerInt(base, -exp);
        }

        double result = 1.0;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    private double absDouble(double x) {
        return x < 0 ? -x : x;
    }

    @Override
    public String getName() {
        return "pow";
    }
}
