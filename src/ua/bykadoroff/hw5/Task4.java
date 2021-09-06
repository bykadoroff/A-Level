package ua.bykadoroff.hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        int[] massOriginal = {1, 2, 3, 7, 3, 9, 2, 5, 3, 9, 4};


        Scanner scan = new Scanner(System.in);
        System.out.println("Tell me what elements you wanna to remove from our array.\n Enter this number (from 0 up to 10)");
        int removeNum = scan.nextInt();
        System.out.println("Original Array " + Arrays.toString(massOriginal));
        System.out.println("After removing " + Arrays.toString(removeElement(massOriginal, removeNum)) + ", element " + removeNum + " was removed");


    }

    private static int[] removeElement(int[] mass, int index) {

        int[] result =  new int[mass.length - 1];
        System.arraycopy(mass, 0, result, 0, index);
        System.arraycopy(mass, index+ 1, result, index, mass.length - index - 1);
        return result;

    }
}


