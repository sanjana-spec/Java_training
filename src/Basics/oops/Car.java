package Basics.oops;

public class Car {
    String brand;
    int manuDate;

    // constructor : creates objects

    Car(String brand, int manuDate){
        this.brand = brand;
        this.manuDate = manuDate;
    }

    public static void main(String[] args) {
        Car c1 = new Car("Inova", 2000);
        System.out.println(c1.brand);
        System.out.println(c1.manuDate);
    }
}
