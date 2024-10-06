import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ввод двух целых чисел и выполнение операций
        System.out.println("Введите первое целое число (a):");
        int a = scanner.nextInt();  // Пользователь вводит число a
        System.out.println("Введите второе целое число (b):");
        int b = scanner.nextInt();  // Пользователь вводит число b

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Выполнение арифметических операций
        int sum = a + b;
        int difference = b - a;
        int product = a * b;
        int quotient = b / a;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // 2. Ввод двух строк и их сравнение
        System.out.println("Введите первую строку:");
        scanner.nextLine();  // Считываем пустую строку после ввода чисел
        String str1 = scanner.nextLine();  // Пользователь вводит первую строку
        System.out.println("Введите вторую строку:");
        String str2 = scanner.nextLine();  // Пользователь вводит вторую строку

        // Сравнение строк
        if (str1.equals(str2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        // 3. Вывод четных чисел из массива
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Четные числа в массиве:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        scanner.close();
    }
}
