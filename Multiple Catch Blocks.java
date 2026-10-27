
public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            String text = null;
            System.out.println(text.length());

            int result = 10 / 0;
            System.out.println(result);

        } catch (NullPointerException e) {
            System.out.println("Error: String is null!");

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        }
    }
}
