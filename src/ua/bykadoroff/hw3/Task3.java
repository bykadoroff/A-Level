package ua.bykadoroff.hw3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Напишите что-то, но сильно не увлекайтесь!");
        String ourText = scan.nextLine();
        System.out.println("Текст до изменения : " + ourText);

        wordsCalc(ourText);

    }

    public static int wordsCalc(String phrase) {
        int count = 0;
        if (phrase.length() != 0) {
            count++;
            for (int i = 0; i < phrase.length(); i++) {
                if (phrase.charAt(i) == ' ') {
                    count++;
                }
            }
        }System.out.println("В строке " + count + " слов");

        return count;
    }
}


