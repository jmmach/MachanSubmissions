public class MachanElaborate {

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        int result1 = multiply(4, 5);
        System.out.println("Multiply two integers (4 * 5): " + result1);

        double result2 = multiply(3.5, 2.5);
        System.out.println("Multiply two decimals (3.5 * 2.5): " + result2);

        int result3 = multiply(2, 3, 4);
        System.out.println("Multiply three integers (2 * 3 * 4): " + result3);
    }
}
