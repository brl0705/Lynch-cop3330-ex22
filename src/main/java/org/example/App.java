package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the second number: ");
        int num2 = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter the third number: ");
        int num3 = input3.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is the largest number.");
        }
        else if(num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the largest number.");
        }
        else if(num3 > num1 && num3 > num2){
            System.out.println(num3 + " is the greatest number.");
        }
        else{
            System.out.println("They are all the same number.");
        }


    }
}
