
public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int a = 20;
            int b = 0;

            System.out.println(a / b);

        } catch (ArithmeticException e) {
            System.out.println("Exception handled!");

        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program ended.");
    }
}
