import java.util.*;
import java.io.*;

public class Car {
    //public variables declared for storing car attributes
    public int id;
    public String make;
    public String model;
    public int yearOfManufacture;
    public String colour;
    public double price;
    public String registrationNumber;

    public static void main(String[] args) throws IOException {
        // Creating an array of car objects in the order -  id, Make, Model, Year of manufacture, Color, Price,
        // Registration number
        List<Car> all_cars = new ArrayList<>();


        Car car1 = new Car();
        car1.id = 1;
        car1.make = "Toyota";
        car1.model = "Corolla";
        car1.yearOfManufacture = 2015;
        car1.colour = "Red";
        car1.price = 10000;
        car1.registrationNumber = "ABC123";
        all_cars.add(car1);

        Car car2 = new Car();
        car2.id = 2;
        car2.make = "Honda";
        car2.model = "Civic";
        car2.yearOfManufacture = 2018;
        car2.colour = "Blue";
        car2.price = 15000;
        car2.registrationNumber = "XYZ456";
        all_cars.add(car2);

        Car car3 = new Car();
        car3.id = 3;
        car3.make = "Toyota";
        car3.model = "Camry";
        car3.yearOfManufacture = 2012;
        car3.colour = "Black";
        car3.price = 8000;
        car3.registrationNumber = "LMN789";
        all_cars.add(car3);

        Car car4 = new Car();
        car4.id = 3;
        car4.make = "Volkswagen";
        car4.model = "Series 10";
        car4.yearOfManufacture = 2024;
        car4.colour = "Grey";
        car4.price = 1500.25;
        car4.registrationNumber = "LMN789";
        all_cars.add(car4);



        for (Car car : all_cars) {
            System.out.println("ID: " + car.id + ", Make: " + car.make + ", Model: " + car.model +
                    ", Year: " + car.yearOfManufacture + ", Color: " + car.colour +
                    ", Price: " + car.price + ", Registration Number: " + car.registrationNumber);
        }



        String filenametask1 = "taskA.txt";
        FileWriter writer = new FileWriter(filenametask1);
        String given_brand = "Toyota";
        for (Car car : all_cars) {
            if (car.make.equalsIgnoreCase(given_brand)) {
               writer.write("ID: " + car.id + ", Make: " + car.make + ", Model: " + car.model +
                        ", Year: " + car.yearOfManufacture + ", Color: " + car.colour +
                        ", Price: " + car.price + ", Registration Number: " + car.registrationNumber + "\n");
            }
        }
        writer.close();
        System.out.println("List of cars filtered based on brand given is written to " + filenametask1);


        String filenametask2 = "taskB.txt";
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        writer = new FileWriter(filenametask2);

        given_brand = "Civic";
        int n = 5;

        for (Car car : all_cars) {
            if (car.model.equals(given_brand) && (currentYear - car.yearOfManufacture) > n) {
                writer.write("ID: " + car.id + ", Make: " + car.make + ", Model: " + car.model +
                        ", Year: " + car.yearOfManufacture + ", Color: " + car.colour +
                        ", Price: " + car.price + ", Registration Number: " + car.registrationNumber + "\n");
            }
        }
        writer.close();
        System.out.println("list of cars of "+given_brand+" model that have been in use for more than "+n+" years is written to " + filenametask2);


        String filenametask3 = "taskC.txt" ;
        writer = new FileWriter(filenametask3);
        int given_year_of_manufacture = 2024;
        double given_price = 1500.15;
        for (Car car : all_cars) {
            if (car.yearOfManufacture == given_year_of_manufacture && car.price > given_price) {
                    writer.write("ID: " + car.id + ", Make: " + car.make + ", Model: " + car.model +
                            ", Year: " + car.yearOfManufacture + ", Color: " + car.colour +
                            ", Price: " + car.price + ", Registration Number: " + car.registrationNumber + "\n");
                }
            }
            writer.close();
            System.out.println("list of cars manufactured in the year " + given_year_of_manufacture +
                     " with the price of which is higher than the " +given_price +
                    "is written to  " + filenametask3);

    }
}
