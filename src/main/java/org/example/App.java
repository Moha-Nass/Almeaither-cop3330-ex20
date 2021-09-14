package org.example;

import java.util.Scanner;

/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Mohammed_Almeaither
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Exercise 20 - Multistate Sales Tax Calculator");
        double orderAmount , taxofStates = 0.0, totalamountoftaxforstates;
        String stateLivein, countyLivein;
        System.out.print("What is the order amount? ");
        Scanner in = new Scanner(System.in);
        orderAmount = Double.parseDouble(in.next());
        System.out.print("What state do you live in?");
        stateLivein = in.next();
        System.out.print("What county do you live in?");
        countyLivein = in.next();


        if(stateLivein.equalsIgnoreCase("Wisconsin"))
        {
            taxofStates = taxofStates +  orderAmount*0.05;
            if(countyLivein.equalsIgnoreCase("Eau Claire"))
            {
                taxofStates = taxofStates + orderAmount*0.00005;
            }
            else if(stateLivein.equalsIgnoreCase("Dunn"))
            {
                taxofStates = taxofStates + orderAmount*0.00004;
            }

        }
        if(stateLivein.equalsIgnoreCase("Illinois"))
        {
            taxofStates = taxofStates + orderAmount*0.08;
        }

        totalamountoftaxforstates = taxofStates+orderAmount;
        System.out.println("The tax is $" + taxofStates+ ".");
        System.out.println("The total is $" + totalamountoftaxforstates);

    }
}
