
public class MultipleCatchDemo {
    public static void main(String[] args) {

        try {
            int[] numbers = {10, 20, 30};

            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");

        } catch (ArithmeticException e) {
            System.out.println("Error: Arithmetic operation failed!");
        }

        System.out.println("Program completed.");
    }
}
