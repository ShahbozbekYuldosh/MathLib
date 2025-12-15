package mymathlib;

public class Ceiling implements MathOperation {
    @Override
    public double calculate(double... args) {
        if (args.length == 0) throw new IllegalArgumentException("Argument kerak");
        double x = args[0];
        int intPart = (int) x;
        if (x > 0 && x > intPart) {
            return intPart + 1;
        }
        return intPart;
    }

    @Override
    public String getName() {
        return "ceil";
    }
}
