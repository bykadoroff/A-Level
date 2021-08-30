package ua.bykadoroff.hw3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Напишите что-то, но сильно не увлекайтесь!");
        String ourText = scan.nextLine();
        System.out.println("Текст до изменения : " + ourText);



        isPolidrome(removeSpaces(ourText));

    }
    public static String removeSpaces(String phrase) {

        String cleanText = phrase.replaceAll("\\s", "");
        System.out.println("Текст после удаления пробеллов : " + cleanText);
        int length = cleanText.length();
        System.out.println("Длина строки : " + length);
        String mirror = new StringBuilder(cleanText).reverse().toString();
        return cleanText;

    }

    public static boolean isPolidrome(String phrase){

        boolean isPolidrome = false;
        String mirror = new StringBuilder(phrase).reverse().toString();

        //       Теперь сравним их через equals

        if (phrase.equals(mirror)){
            System.out.println("Чере equals : Сто пудов имеем дело с перевёртышем");
            return true;
        } else {
            System.out.println("Чере equals : Похоже что это просто выпердыш, а не перевёртыш. Но!!! в этот раз для сравнения мы использовали метод equals");
            return false;
        }

    }

}
