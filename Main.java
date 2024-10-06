public class Main {
    public static void main(String[] args) {
        // Compare two integers
        int a = 5;
        int b = 10;
        System.out.println("a is greater than b: " + (a > b));

        // Perform basic arithmetic operations
        int sum = a + b;
        int difference = b - a;
        int product = a * b;
        int quotient = b / a;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // Compare two strings
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("Strings are equal: " + str1.equals(str2));

        // Output even numbers from an array
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Even numbers in the array:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
