import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 5;
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }
        System.out.println();
        System.out.println("Choose the algorithm of sort");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            System.out.println(i);
        } else {
            System.out.println("Вы ввели не целое число");
        }

    }
        }