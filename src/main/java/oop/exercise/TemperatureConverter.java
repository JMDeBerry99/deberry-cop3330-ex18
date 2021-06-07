/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercise;
import java.util.Scanner;

public class TemperatureConverter
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit." +
                "\nYour choice: ");
        String choice = in.nextLine();
        String tempConvertedTo = "";
        int convertedTemp = 0;

        if(choice.equalsIgnoreCase("C"))
        {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            String tempString = in.nextLine();
            int temp = Integer.parseInt(tempString);
            convertedTemp = (temp - 32) * 5 / 9;
            tempConvertedTo = "Celsius";
        }
        if(choice.equalsIgnoreCase("F"))
        {
            System.out.print("Please enter the temperature in Celsius: ");
            String tempString = in.nextLine();
            int temp = Integer.parseInt(tempString);
            convertedTemp = temp * 9 / 5 + 32;
            tempConvertedTo = "Fahrenheit";
        }
        System.out.print("The temperature in " + tempConvertedTo + " is " + convertedTemp + ".");
    }
}
