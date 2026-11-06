public class test36 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30};

        try {
            System.out.println("Array element: " + arr[5]);

            int a = 10, b = 0;
            System.out.println("Division: " + (a / b));
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        System.out.println("Program continues...");
    }
}