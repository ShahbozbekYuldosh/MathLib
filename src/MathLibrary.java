import mymathlib.*;

public class MathLibrary {
    private final MathOperation[] operations;

    public MathLibrary() {
        operations = new MathOperation[15];
        operations[0] = new AbsoluteValueInt();
        operations[1] = new ArcCosine();
        operations[2] = new ArcSine();
        operations[3] = new ArcTangent();
        operations[4] = new Ceiling();
        operations[5] = new Cosine();
        operations[6] = new Exponential();
        operations[7] = new AbsoluteValueFloat();
        operations[8] = new Floor();
        operations[9] = new Modulo();
        operations[10] = new NaturalLogarithm();
        operations[11] = new Power();
        operations[12] = new Sine();
        operations[13] = new SquareRoot();
        operations[14] = new Tangent();
    }

    public MathOperation getOperation(int index) {
        if (index < 0 || index >= operations.length) {
            throw new IndexOutOfBoundsException("Noto'g'ri indeks: " + index);
        }
        return operations[index];
    }

    public void displayAllOperations() {
        System.out.println("=== Matematik Kutubxona Operatsiyalari ===");
        for (int i = 0; i < operations.length; i++) {
            System.out.println(i + ". " + operations[i].getName());
        }
    }
}
