package ua.bykadoroff.hw5;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int mass[][] = new int[7][12];

        fillMass(mass);

    }

    public static void fillMass(int[][] mass) {
        int k = 0; // Индекс начинается с 0

        for (int i = 0; i < mass.length; i++) {
            System.out.println();
            for (int j = 0; j < mass[i].length; j++) {
                if (i % 2 == 0 ){
                    mass[i][j] = k++;}
                else {mass[i][j] = (-1)*(k++);}
                System.out.print(mass[i][j] + " | ");
            }
        }
    }

}
