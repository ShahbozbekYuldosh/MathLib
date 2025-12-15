package mymathlib;

public class AbsoluteValueFloat implements MathOperation {
    @Override
    public double calculate(double... args) {
        if (args.length == 0) throw new IllegalArgumentException("Argument kerak");
        double x = args[0];
        return x < 0 ? -x : x;
    }

    @Override
    public String getName() {
        return "fabs";
    }
}
