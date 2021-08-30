package ua.bykadoroff.hw3;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task4_Practice {


    public static void main(String[] args) {

        int secret = ThreadLocalRandom.current().nextInt(1, 12);
        int count = 0;
        boolean gameRunning = true;

        Scanner scan = new Scanner(System.in);
        System.out.println("Привет мальчик! Давай сыграем в игру, Я(Комп + пока что, примитивный код) - искусственный интелект. \n" +
                "Я загадал число от 1 до 12, используя метода ThreadLocalRandom.current().nextInt(1, 12)\n" +
                "Если Ты фартовый мальчик, то угадаешь максимум с ТРЁХ попыток и получишь разные хорошие сюрпризы в материальном мире...Лучше угадать с первого раза!\n" +
                "Если не угадаешь, то Я прийду за тобой и съем твои яйца! И помни!... нельзя делать принтлн и подглядывать!...тогда я прийду раньше...\n" +
                "Ну Мы начали...только не спеши, попробуй подсознанию помочь тебе. Вводи число!");
        int guess = scan.nextInt();

        while (gameRunning) {


            if (guess > secret) {
                System.out.println("Вообще-то я загадал число поменьше...");
                System.out.println("-----------------------");
                count++;

            } else if (guess < secret) {
                System.out.println("Я загадал немножко больше ");
                System.out.println("-----------------------");
                count++;

            } else if (guess == secret) {
                System.out.println("Ну да...это оно....");
                System.out.println("-----------------------");
                gameRunning = false;
                count++;
                break;
            }

            guess = scan.nextInt();
        }

        if (count == 1) {
            System.out.println("Ты фортовый мальчик и скоро ты получишь приятный бонус!");
        } else if (count != 1 && count < 4) {
            System.out.println("С первого раза уже не вышло....но в принципе тоже неплохо...что-то хорошее получишь. По возможности избегай контактов с циркуляркой.");
        } else if (count > 4 && count < 7) {
            System.out.println("Ты не фартовый мальчик....Я прийду скоро за тобой.");
        } else  {
            System.out.println("Я прийду и съем твои яйца. А пока не пользуйся ножами, не бери в руки бензопилу, и не проверяй, мертв ли крокодил...");
        }

    }

}