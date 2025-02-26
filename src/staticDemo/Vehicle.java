package staticDemo;

public class Vehicle {
    static int totalVehicles = 0;
    String brand;
    int speed;

    public Vehicle (String brand, int speed){
        this.brand = brand;
        this.speed = speed;
        totalVehicles ++;
    }

    public void displayCarInfo(){
        System.out.println("My " + brand + " is going at " + speed);
    }

    public static int getTotalVehicles(){
        return totalVehicles;
    }

    public static void main(String[] args){
        Vehicle car1 = new Vehicle("Toyota", 60);
        System.out.println("Number of vehicles is " + Vehicle.getTotalVehicles());
        Vehicle car2 = new Vehicle("Chevrolet", 90);
        System.out.println("Number of vehicles is " + Vehicle.getTotalVehicles());

        car1.displayCarInfo();
        car2.displayCarInfo();
    }
}


