package ua.bykadoroff.hw5;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task2 {

    public static void main(String[] args) {

        int array[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int mass[] = new int[10];

        fillMass(mass, 1, 9);
        System.out.println("Filled massive " + Arrays.toString(array));
        System.out.println("Filled massive on increment checking : " + checkIncrement(array));
        System.out.println("Random massive " + Arrays.toString(mass));
        System.out.println("Random massive on increment checking : " + checkIncrement(mass));

    }

    public static void fillMass(int[] mass, int min, int max) {

        for (int i = 0; i < mass.length; i++) { // Делаем цикл в котором заполняем массив случайными числами
            mass[i] = ThreadLocalRandom.current().nextInt(min, max);
        }
    }

// (Только вариант, закомитенрый, не работает, хотя логика таже самая)
//    public static boolean checkIncrement(int[] mass) {
//        for (int i = 1; i < mass.length; i++) {
//            if (mass[i - 1] > mass[i]) {
//                return true;
//            }
//        }
//        return false;
//    }

    public static boolean checkIncrement(int [] mass){
        for(int i =1; i < mass.length; i ++){
            if (mass[i] > mass[i -1]){
                return false;
            }
        }
        return true;
    }

}
