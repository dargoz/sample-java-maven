package com.dargoz;

import com.dargoz.model.Car;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {

        Car car = new Car("red", 4);

        String color = car.getColor(); // will return the car color
        System.out.println("Car color : " + color);

        car.startEngine();

        // int result = sum(4, 5);
        Car a = new Car("red", 4);
        // System.out.println(a.getColor());
        // change(a);
        // System.out.println(a.getColor());

        // printSumOf(2, 3);
        // System.out.println("\n\n");

        // printNumbers(30);

        // printNumbers(1, 2, 3);

        // printNumbers(10, 15, 20, 25);

        try {
            printNumber('a');
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        printCharacter('1');
    }

    // private static int sum(int number1, int number2) {
    //     return number1 + number2;
    // }

    private static void change(Car a) {
        a.setColor("green");
    }

    private static void printSumOf(int number1, int number2) {
        System.out.println("result : " + number1 + number2);
    }

    public static void printNumbers(int ... numbers) {
        System.out.println("Number of arguments : " + numbers.length);
        for(int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\n");
    }

    //checked exception
    public static void printNumber(char ... characters) throws Exception {
        for(char character : characters) {
            if(!Character.isDigit(character)) {
                throw new Exception("only number allowed");
            } else {
                System.out.println(character);
            }
        }
    }

    //unchecked exception
    public static void printCharacter(char ... characters) {
        for(char character : characters) {
            if(Character.isDigit(character)) {
                throw new IllegalArgumentException("only character allowed");
            } else {
                System.out.println(character);
            }
        }
    }

}
