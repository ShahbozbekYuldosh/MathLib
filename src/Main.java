public class Main {
    public static void main(String[] args) {
        MathLibrary library = new MathLibrary();

        System.out.println("Matematik Kutubxonani Testlash (0 dan yozilgan)\n");
        library.displayAllOperations();

        System.out.println("\n=== Test Natijalari ===");

        try {
            // 0. abs(int) - butun sonning absolut qiymati
            System.out.println("abs(-5) = " + library.getOperation(0).calculate(-5));

            // 1. acos - arc cosine
            System.out.println("acos(0.5) = " + library.getOperation(1).calculate(0.5));

            // 2. asin - arc sine
            System.out.println("asin(0.5) = " + library.getOperation(2).calculate(0.5));

            // 3. atan - arc tangent
            System.out.println("atan(1) = " + library.getOperation(3).calculate(1));

            // 4. ceil - yaqin katta butun
            System.out.println("ceil(3.2) = " + library.getOperation(4).calculate(3.2));

            // 5. cos - cosine
            System.out.println("cos(0) = " + library.getOperation(5).calculate(0));

            // 6. exp - e ning darajasi
            System.out.println("exp(1) = " + library.getOperation(6).calculate(1));

            // 7. fabs - float absolut qiymat
            System.out.println("fabs(-3.14) = " + library.getOperation(7).calculate(-3.14));

            // 8. floor - yaqin kichik butun
            System.out.println("floor(3.8) = " + library.getOperation(8).calculate(3.8));

            // 9. fmod - qoldiq
            System.out.println("fmod(7, 3) = " + library.getOperation(9).calculate(7, 3));

            // 10. log - natural logarifm
            System.out.println("log(2.718) = " + library.getOperation(10).calculate(2.718));

            // 11. pow - daraja
            System.out.println("pow(2, 3) = " + library.getOperation(11).calculate(2, 3));

            // 12. sin - sine
            System.out.println("sin(0) = " + library.getOperation(12).calculate(0));

            // 13. sqrt - kvadrat ildiz
            System.out.println("sqrt(16) = " + library.getOperation(13).calculate(16));

            // 14. tan - tangent
            System.out.println("tan(0) = " + library.getOperation(14).calculate(0));

        } catch (Exception e) {
            System.out.println("Xatolik: " + e.getMessage());
        }
    }
}