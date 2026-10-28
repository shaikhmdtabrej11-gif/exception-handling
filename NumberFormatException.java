
public class NumberFormatDemo {
    public static void main(String[] args) {
        String value = "123abc";

        try {
            int number = Integer.parseInt(value);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        }
    }
}
