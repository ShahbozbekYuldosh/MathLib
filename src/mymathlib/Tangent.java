package mymathlib;

public class Tangent implements MathOperation{
    @Override
    public double calculate(double... args) {
        if (args.length == 0) throw new IllegalArgumentException("Argument kerak");
        double x = args[0];

        // tan(x) = sin(x) / cos(x)
        Sine sin = new Sine();
        Cosine cos = new Cosine();

        double cosValue = cos.calculate(x);
        if (absDouble(cosValue) < 1e-10) {
            throw new IllegalArgumentException("tan() π/2 + πn da aniqlanmagan");
        }

        return sin.calculate(x) / cosValue;
    }

    private double absDouble(double x) {
        return x < 0 ? -x : x;
    }

    @Override
    public String getName() {
        return "tan";
    }
}
