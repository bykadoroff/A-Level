package ua.bykadoroff.hw4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task4 {

    public static void main(String[] args) {
        int mass[] = new int[2000];
        fillMass(mass,1,10);
        changeOnZero(mass);


    }

    public static void fillMass(int[] mass, int min, int max) {

        for (int i = 0; i < mass.length; i++) { // Делаем цикл в котором заполняем массив случайными числами
            mass[i] = ThreadLocalRandom.current().nextInt(min, max);
        }
        System.out.println(Arrays.toString(mass));
    }

    public static void changeOnZero (int mass[]){

        for (int i = 0; i < mass.length; i ++) {
            if (mass[i] % 2 == 0) {
                mass[i] = 0;
            }
        }
        System.out.println("Это уже после замены четных на 0");
        System.out.println(Arrays.toString(mass));

    }

}
