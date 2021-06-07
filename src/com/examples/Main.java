package com.examples;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        double OrderAmount;
        double tax = 0.55;
        double total;

        System.out.print("What is the order amount? ");
            OrderAmount = myObj.nextDouble();

        System.out.print("What is the state? ");
            String State = myObj.next();
            State = State.toUpperCase();

        total = OrderAmount;


        if(State.equals("WI"))
        {
            tax = OrderAmount * 0.055;
            total = tax + OrderAmount;

            System.out.println("The subtotal is: $" + OrderAmount + "\nThe tax is $" + tax );
        }

        double rounded = Math.round(total * 100)/100.00;
        System.out.println("The total is: $" + rounded);

    }
}
