/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zachtest1;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jacobcole
 */
public class ZachTest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Greetings, Earthling!");

       
        Scanner sc = new Scanner(System.in);
//        String i1 = sc.next();
//        String i2 = sc.next();
//        
//        String catz = i1 + i2;
//        /* will wait for input then assign it to the variable,
//         * in this case it will wait for an int.
//         */
//        System.out.println(catz); // will print the variable

//        int int1 = sc.nextInt();
//        int int2 = sc.nextInt();
//        
//        int newInt = int1 + int2;
//        
//        System.out.println(newInt);

        Car jacobsCar = new Hummer();
        jacobsCar.drive(300);
        
        Car zachsCar = new Prius();
        zachsCar.drive(300);
        
        
        System.out.println("Jacob's " + jacobsCar.toString());
        System.out.println("Zach's " + zachsCar.toString());
       
        
        Car[] cars = {
            new Hummer(),
            new Prius(),
            new Prius(),
            new Car(),
        };
        
        for (int i=0; i<cars.length; i++) {
            cars[i].drive(100);
            System.out.println("The " + cars[i].getClass().getSimpleName()
                    + cars[i].toString());
        }
        
//        int n = sc.nextInt();
//        
//        for (int i=0; i<n; i++)
//           System.out.println(ZachTest1.fib(i));
    }
  
    
    static int fib(int n) {
        if (n<2)
            return 1;
        return fib(n-1) + fib(n-2);
    }
    
}


class Car {
    double gallonsOfFuel = 10;
    double position = 0;
    double mpg = 20;
    
    void drive(int distance) {
        
        double maxDistance = mpg * gallonsOfFuel;
        
        if (distance < maxDistance) {
            this.position += distance;
            this.gallonsOfFuel -= distance / mpg;
        }
        else {
            this.position += maxDistance;
            this.gallonsOfFuel = 0;
        }
        
    }
    
    public String toString(){
        return "Car is at " + this.position + "\n" +
                        "Fuel Level is: " + this.gallonsOfFuel + " gallons." + "\n";
    }
}

class Hummer extends Car {
    Hummer() {
        this.mpg = 1;
    }
 
        
    public String toString(){
        return super.toString() + " 'Murica!" + "\n";
    }
    
}

class Prius extends Car {
    Prius() {
        this.mpg = 100;
    }
}