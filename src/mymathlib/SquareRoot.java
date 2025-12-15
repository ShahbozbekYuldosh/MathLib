package mymathlib;

public class SquareRoot implements MathOperation{
    @Override
    public double calculate(double... args) {
        if (args.length == 0) throw new IllegalArgumentException("Argument kerak");
        double x = args[0];
        if (x < 0) throw new IllegalArgumentException("Manfiy sondan ildiz olib bo'lmaydi");
        if (x == 0) return 0;

        // Newton usuli: x_{n+1} = (x_n + S/x_n) / 2
        double guess = x / 2.0;
        double epsilon = 1e-15;

        for (int i = 0; i < 50; i++) {
            double newGuess = (guess + x / guess) / 2.0;
            if (absDouble(newGuess - guess) < epsilon) {
                return newGuess;
            }
            guess = newGuess;
        }

        return guess;
    }

    private double absDouble(double x) {
        return x < 0 ? -x : x;
    }

    @Override
    public String getName() {
        return "sqrt";
    }
}
