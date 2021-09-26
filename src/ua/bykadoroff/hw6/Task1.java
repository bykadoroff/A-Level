package ua.bykadoroff.hw6;

public class Task1 {

    public static void main(String[] args) {

        Phone apple = new Phone();
        Phone samsung = new Phone();
        Phone huawei = new Phone();


        apple.number = "+380954893333";
        apple.model = "Iphone SE 2020";
        apple.weight = 148.5;
        System.out.println("Apple: " + apple.model + ", " + apple.weight + " grams" + ", number: " + apple.number);
        apple.receiveCall("Gulia");
        System.out.println(apple.getNumber());
        

        samsung.number = "+380957613850";
        samsung.model = "A52";
        samsung.weight = 152.3;
        System.out.println("Samsung: " + samsung.model + ", " + samsung.weight + " grams" + ", number: " + samsung.number);
        samsung.receiveCall("Serg");
        System.out.println(apple.getNumber());


        huawei.number = "+380506049986";
        huawei.model = "P40 Lite";
        huawei.weight = 183.7;
        System.out.println("Huawei: " + huawei.model + ", " + huawei.weight + " grams" + ", number: " + huawei.number);
        huawei.receiveCall("Svetlana");
        System.out.println(huawei.getNumber());


    }
}
