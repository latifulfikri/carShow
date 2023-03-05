/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.vikriyuwi.quizinheritance;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fikriyuwi
 */

public class QuizInheritance {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList<CarType> cars = new ArrayList<>();
        
        cars.add(new CarType("Jeep"));
        cars.add(new CarType("SUV"));
        cars.add(new CarType("Sedan"));
        
        cars.get(0).capasity = 30;
        cars.get(0).speed = 120;
        
        cars.get(1).capasity = 15;
        cars.get(1).speed = 100;
        
        cars.get(2).capasity = 30;
        cars.get(2).speed = 120;
        
        System.out.println("---Welcome to Car showroom---");
        
        int run = 1;
        
        while(run == 1)
        {
            int menuSelect;
            System.out.println("Menu :");
            System.out.println("[1] Buy a car");
            System.out.println("[2] Show a cars");
            System.out.println("[3] Exit");
            System.out.print("Please select the menu above : ");
            menuSelect = input.nextInt();

            switch(menuSelect)
            {
                case 1:
                    System.out.println("\nHere the list of cars : ");
                    for (int i = 0; i < cars.size(); i++) {
                        System.out.println("[" + (i+1) + "] " + cars.get(i).name);
                    }

                    int buyCar;
                    System.out.print("Which number of car you want to buy : ");
                    buyCar = input.nextInt();

                    System.out.println("Here is detail of the car you choose");
                    System.out.println("\n-------------------------------------");
                    System.out.println("Name     : " + cars.get((buyCar-1)).name);
                    System.out.println("Capasity : " + cars.get((buyCar-1)).capasity);
                    System.out.println("Speed    : " + cars.get((buyCar-1)).speed);
                    System.out.println("-------------------------------------\n");

                    char confirm;
                    System.out.println("\nPlease confirm you want to buy the car (y/n) : ");
                    confirm = input.next().charAt(0);
                    System.out.println("\n-------------------------------------\n");
                    if (confirm == 'y' || confirm == 'Y') {
                        cars.get((buyCar-1)).buy();
                    } else {
                        System.out.println("Buy car canceled!\n");
                    }
                    System.out.println("-------------------------------------\n");
                    break;
                case 2:
                    System.out.println("\nHere the list of cars : ");
                    for (int i = 0; i < cars.size(); i++) {
                        System.out.println("[" + (i+1) + "] " + cars.get(i).name);
                    }
                    System.out.println("");
                    System.out.println("-------------------------------------\n");
                    break;
                case 3:
                    System.out.println("Thank you for visiting.. see you later!\n");
                    System.out.println("-------------------------------------\n");
                    run = 0;
                    break;
                default:
                    System.out.println("You press the wrong number of menu\n");
                    System.out.println("-------------------------------------\n");
                    break;
            }
        }
    }
}
