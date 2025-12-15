package mymathlib;

public class Modulo implements  MathOperation {
    @Override
    public double calculate(double... args) {
        if (args.length < 2) throw new IllegalArgumentException("2 ta argument kerak");
        double x = args[0];
        double y = args[1];

        if (y == 0) throw new IllegalArgumentException("Nolga bo'lib bo'lmaydi");

        // fmod(x, y) = x - floor(x/y) * y
        Floor floor = new Floor();
        double quotient = x / y;
        return x - floor.calculate(quotient) * y;
    }

    @Override
    public String getName() {
        return "fmod";
    }
}
