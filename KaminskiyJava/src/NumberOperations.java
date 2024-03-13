import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ввод двух целых чисел
        System.out.print("Введите первое целое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int b = scanner.nextInt();
        
        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        
        // Операции с числами и вывод результата
        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));
        
        // Проверка деления на 0
        if (b != 0) {
            System.out.println("Частное: " + ((double) a / b));
        } else {
            System.out.println("На ноль делить нельзя!");
        }
        
        System.out.println("Произведение: " + (a * b));
        
        scanner.close();
    }
}
