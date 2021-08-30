package ua.bykadoroff.hw2;

public class Task2 {

    public static void main(String[] args) {

        System.out.println(getSquare(2,2,5.6,7.1,10.8,2));

    }


    public static double getSquare (double x1, double y1, double x2,  double y2,  double x3,  double y3 ){

//        S ∆ ABC = ½ │(x2-x1)(y3-y1)-(x3-x1)(y2-y1)│ - формула площади треуголчатки


        double square = Math.abs(((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1)*0.5));
        return square;

    }


}
