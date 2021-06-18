package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        float Result;

        System.out.print("Enter first number: ");
        float firstNumber = userInput.nextFloat();

        System.out.print("Enter second number: ");
        float secondNumber = userInput.nextFloat();

        System.out.print("Select operation: \n1. Sum. \n2. Subtraction. \n3. Multiplication. \n4. Division. \nChoice: ");
        int selection = userInput.nextInt();

        switch (selection) {
            case 1:
                Result = firstNumber + secondNumber;
                System.out.println(Result);
                break;

            case 2:
                Result = firstNumber - secondNumber;
                System.out.println(Result);
                break;

            case 3:
                Result = firstNumber * secondNumber;
                System.out.println(Result);
                break;

            case 4:
                if(secondNumber == 0) {
                    System.out.print("The fuck are you doing, bro?");
                } else {
                    Result = firstNumber / secondNumber;
                    System.out.println(Result);
                }
                break;

            default:
                System.out.print("Wrong choice, man. Try again.");
        }
    }
}