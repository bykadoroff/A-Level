package ua.bykadoroff.hw5;

import java.util.concurrent.ThreadLocalRandom;

public class Task3 {

    public static void main(String[] args) {
        int mass[][] = new int[10][10];
        fillMassiveNxN(mass);
        changeMatrix(mass);


    }

    protected static void fillMassiveNxN(int[][] mass) {
        System.out.println("Array after filling : ");
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                mass[i][j] = ThreadLocalRandom.current().nextInt(1, 10);
                System.out.print(mass[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println();
    }

    protected static void changeMatrix(int[][] mass) {
        System.out.println("Array after change rows on columns");
        for (int i = 0; i < mass.length; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                int temp = mass[i][j];
                mass[i][j] = mass[j][i];
                mass[j][i] = temp;
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                System.out.print(mass[i][j] + "|");
            }
            System.out.println();
        }
    }
}
