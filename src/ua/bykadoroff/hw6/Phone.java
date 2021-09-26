package ua.bykadoroff.hw6;

public class Phone {


    protected String number;
    protected String model;
    protected double weight;


    protected void receiveCall(String name) {
        System.out.println("Звонит: " + name);
    }

    protected String getNumber() {
        return number;
    }


    Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone(){}


}
