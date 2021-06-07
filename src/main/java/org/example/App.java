package org.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Chad Higgins
 */

/*
Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.

Write a program that asks for three numbers.
Check first to see that all numbers are different.
If they’re not different, then exit the program.
Otherwise, display the largest number of the three.

Example Output
Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
The largest number is 51.

Constraint
Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        int numArray[] = new int[3];

        System.out.println("Enter the first number: ");
        numArray[0] = in.nextInt();
        System.out.println("Enter the second number: ");
        numArray[1] = in.nextInt();
        System.out.println("Enter the third number: ");
        numArray[2] = in.nextInt();

        int numberOfNumbers = 3;

        if(numArray[0] != numArray[1] && numArray[0] != numArray[2] && numArray[1] != numArray[2])
        {
            int maxNumber = numArray[0];
            for(int i = 0; i < numberOfNumbers; i++)
            {
                if(maxNumber < numArray[i])
                {
                    maxNumber = numArray[i];
                }
            }

            System.out.println("The largest number is "+ maxNumber +".");
        }
    }
}
