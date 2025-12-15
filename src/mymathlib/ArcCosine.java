package mymathlib;

public class ArcCosine implements MathOperation {
    @Override
    public double calculate(double... args) {
        if (args.length == 0) throw new IllegalArgumentException("Argument kerak");
        double x = args[0];
        if (x < -1 || x > 1) {
            throw new IllegalArgumentException("Qiymat -1 va 1 orasida bo'lishi kerak");
        }
        // acos(x) = PI/2 - asin(x)
        double PI = 3.14159265358979323846;
        return PI / 2.0 - new ArcSine().calculate(x);
    }

    @Override
    public String getName() {
        return "acos";
    }
}
