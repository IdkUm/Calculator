import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        //ask user for the calculation

        Scanner calculation = new Scanner(System.in);
        System.out.println("pleas enter your four function calculation");
        String userCalculation = calculation.nextLine();

        System.out.println(userCalculation);

        //convert to int and remove spaces

        String something = userCalculation;
        int length = something.length();
        String numOne = "";
        String numTwo = "";
        String operation = "";
        boolean firstNum = true;

        for (int i = 0; i < length; i++) {
            char character = something.charAt(i);
            if (Character.isDigit(character)&& firstNum) {
                numOne += character;
            }
            else if (!Character.isDigit(character)){
                firstNum = false;
                operation += character;
            }
            else{
                numTwo += character;
            }
        }
        System.out.println(numOne);
        System.out.println(numTwo);
        System.out.println(operation);

        //num in int
        double numOneInt = Integer.parseInt(numOne);
        double numOneTwo = Integer.parseInt(numTwo);



        //calculate

        if (operation.equals("+")){
            double ansOne = (numOneInt+numOneTwo);
            System.out.println(ansOne);
        }
        else if (operation.equals("-")){
            double ansOne = (numOneInt-numOneTwo);
            System.out.println(ansOne);
        }
        else if (operation.equals("*")){
            double ansOne = (numOneInt*numOneTwo);
            System.out.println(ansOne);
        }
        else if (operation.equals("/")){
            double ansOne = (numOneInt/numOneTwo);
            System.out.println(ansOne);
        }
        else{
            System.out.println("oops somthing went wrong");
        }



        //print

    }
}

//import java.io.*;
//import java.lang.*;
//import java.lang.Math;
//import java.util.Scanner;
//public class BasicCalculator {
//
//    public static void main(String[] args)
//    {
//        // stores two numbers
//        double num1, num2;
//
//        // Take input from the user
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the numbers");
//
//        // take the inputs
//        num1 = sc.nextDouble();
//
//        num2 = sc.nextDouble();
//
//        System.out.println("Enter the operator (+,-,*,/)");
//
//        char op = sc.next().charAt(0);
//
//        double o = 0;
//
//        switch (op) {
//
//            // case to add two numbers
//            case '+':
//
//                o = num1 + num2;
//
//                break;
//
//            // case to subtract two numbers
//            case '-':
//
//                o = num1 - num2;
//
//                break;
//
//            // case to multiply two numbers
//            case '*':
//
//                o = num1 * num2;
//
//                break;
//
//            // case to divide two numbers
//            case '/':
//
//                o = num1 / num2;
//
//                break;
//
//            default:
//
//                System.out.println("You enter wrong input");
//
//                break;
//        }
//
//        System.out.println("The final result:");
//
//        System.out.println();
//
//        // print the final result
//        System.out.println(num1 + " " + op + " " + num2
//                + " = " + o);
//    }
