package ua.bykadoroff.hw2;

public class Task4 {
    public static void main(String[] args) {

        moduleLess(-14, -33, 75);

    }

    public static void moduleLess(int a, int b, int c) {

        int minimal = (Math.abs(a) <= Math.abs(b)) ? ((Math.abs(a) <= Math.abs(c)) ? Math.abs(a) : Math.abs(c)) : ((Math.abs(b) <= Math.abs(c) ? Math.abs(b) : Math.abs(c)));

        System.out.println(minimal);

    }
}
