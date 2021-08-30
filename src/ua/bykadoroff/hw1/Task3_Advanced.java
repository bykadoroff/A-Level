package ua.bykadoroff.hw1;
import java.util.Scanner;

public class Task3_Advanced {

    public static void main(String[] args) {

        System.out.print("Введите число от 0 до 100000000: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Вы ввели число " + number);
        String str = Integer.toString(number);
        String mirror = new StringBuilder(str).reverse().toString();

        System.out.println("Обратно будет " + mirror);
    }

}


