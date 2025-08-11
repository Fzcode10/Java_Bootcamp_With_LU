package com.letsUp.project1;

import java.util.Scanner;

public class BasicCalculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter a number between 1 and 10:");
            int number1 = sc.nextInt();
            System.out.print("Enter a number between 1 and 10:");
            int number2 = sc.nextInt();
            System.out.print("Enter for Addition + \n");
            System.out.print("Enter for Subtraction - \n");
            System.out.print("Enter for Multiplication * \n");
            System.out.print("Enter for Division / \n");
            String operation = sc.next();
            switch(operation){
                case "+" :
                    System.out.println("Addition = " + (number1 + number2));
                    break;
                case "-" :
                    System.out.println("Subtract  = " + (number1 - number2));
                    break;
                case "*" :
                    System.out.println("Multiply  = " + (number1 * number2));
                    break;
                case "/" :
                    System.out.println("Division  = " + (number1 / number2));
                    break;
                default :
                    System.out.println("Entered option is incorrect ");
            }
            System.out.print("Enter Y for continue & N for Discontinue");
            String key =  sc.next();
            if(key.equals("N")){
                break;
            } else if(key.equals("Y")){
                continue;
            }
        }
    }
}
