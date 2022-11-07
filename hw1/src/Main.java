import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1");
        System.out.println("Array Length: ");
        int n = scanner.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        double summ = 0;
        double max = 0;
        double min = array[0];
        for (double value : array) {
            summ += value;
            if (value > max) {
                max = value;
            }
        }
        for (double v : array) {
            if (v < min) {
                min = v;
            }
        }
        double average = summ / n;
        System.out.print("Max: ");
        System.out.print(max + "\n");
        System.out.print("Avg: ");
        System.out.print(average + "\n");
        System.out.print("Min: ");
        System.out.print(min + "\n");
        // Task2
        System.out.println("Задание 2");
        for (int i = 2; i <= 100; i++){
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}