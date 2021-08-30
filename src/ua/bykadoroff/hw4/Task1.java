package ua.bykadoroff.hw4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task1 {


    public static void main(String[] args) {

        int mass[] = new int[400]; // Создаём массив из 400 чисел, тип данных int
        fillMass(mass,1,10);
        System.out.println("Среднее арифметическое: " + averageArithmetic(mass));
        System.out.println("Среднее фрифметическое используя Arrays.stream.average())" + Arrays.stream(mass).average());
        System.out.println("Среднее геометрическое массива " + averageGeometric(mass));


    }

    public static void fillMass(int[] mass, int min, int max){

        for (int i = 0; i < mass.length; i++) { // Делаем цикл в котором заполняем массив случайными числами
            mass[i] = ThreadLocalRandom.current().nextInt(min, max);
        }
        System.out.println(Arrays.toString(mass));
    }


    public static double averageArithmetic(int [] mass){
        double sum = 0;
        for (int i = 0; i < mass.length; i++) { // Цикл в котором получаем общую сумму значение массива
            sum = sum + mass[i];
        }
        double average = sum / mass.length; // Получаем среднее арифметическое, используя обычгую формулу (Вариант 1)
        return average;
    }

    public static double averageGeometric(int [] mass){
        double multiplication = 1;

//        for (int i = 0; i < mass.length; i++){
//            multiplication = multiplication * mass[i];
//        }
        for (int i: mass){ // Все пытаюсь перейти на укороченную запись перебора цикла форич
            multiplication *=i;
        }
        double gm = Math.pow(multiplication, (double)1 / mass.length);
        return gm;
    }

}
