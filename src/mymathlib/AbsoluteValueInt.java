package mymathlib;

public class AbsoluteValueInt implements MathOperation {
    @Override
    public double calculate(double... args) {
        if (args.length == 0) throw new IllegalArgumentException("Argument kerak");
        int value = (int) args[0];
        return value < 0 ? -value : value;
    }

    @Override
    public String getName() {
        return "abs(int)";
    }
}
