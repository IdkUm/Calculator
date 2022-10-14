import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        //ask user for the calculation
        // Enter a string
        // e.g 123.5+10/16*45-35
        Scanner calculation = new Scanner(System.in);
        System.out.println("Please enter your four function calculation, this will go in the order of operations that you input.");
        String userCalculation = calculation.nextLine();
        System.out.println(userCalculation);

        // in a loop search string for first operator
        int length = userCalculation.length();
        ArrayList<String> operators = new ArrayList<String>();
        ArrayList<String> nums = new ArrayList<String>();

        char charPlus = ('+');
        char charMinus = ('-');
        char charMulti = ('*');
        char charDiv = ('/');
        String finalNum = "";
        int n = 0;

//  i i++  length of string
// search for first operator
// substring of string form 0 to operator
// store in array
// store operator in second array
// redefine substring as starting from character after operator
// loop until no operators exist
// store last value in array of numbers
        for (int i = 0; i < length; i++) {
            char character = userCalculation.charAt(i);
            if(Character.compare(character, charPlus) == 0) {
                operators.add("+");
                nums.add(userCalculation.substring(n, i));
                n = i+1;
                finalNum = userCalculation.substring(n);
            }
            else if(Character.compare(character, charMinus) == 0) {
                operators.add("-");
                nums.add(userCalculation.substring(n, i));
                n = i+1;
                finalNum = userCalculation.substring(n);
            }
            else if(Character.compare(character, charMulti) == 0) {
                operators.add("*");
                nums.add(userCalculation.substring(n, i));
                n = i+1;
                finalNum = userCalculation.substring(n);
            }
            else if(Character.compare(character, charDiv) == 0) {
                operators.add("/");
                nums.add(userCalculation.substring(n, i));
                n = i+1;
                finalNum = userCalculation.substring(n);

            }
            else{
                System.out.println(operators);
                System.out.println(nums);
            }
        }
        nums.add(finalNum);
        System.out.println(operators);
        System.out.println(nums);

        // run through array values applying the correct operator
        double currentNum = Double.parseDouble(nums.get(0));
        for (int i = 0; i < operators.size(); i++){
            char operatorChar = operators.get(i).charAt(0);
            double mynum = Double.parseDouble(nums.get(i));
            double mynum2 = Double.parseDouble(nums.get(i+1));

            if(Character.compare(operatorChar, charPlus) == 0) {
                currentNum = (currentNum+mynum2);
                System.out.println(currentNum);
            }
            else if(Character.compare(operatorChar, charMinus) == 0) {
                currentNum = (currentNum - mynum2);
                System.out.println(currentNum);
            }
            else if(Character.compare(operatorChar, charMulti) == 0) {
                currentNum = (currentNum * mynum2);
                System.out.println(currentNum);
            }
            else if(Character.compare(operatorChar, charDiv) == 0) {
                currentNum = (currentNum / mynum2);
                System.out.println(currentNum);
            }
        }
        }
    }
// e.g 123.5+10/16*45-35








//convert to int and remove spaces
//        String something = userCalculation;
//        int length = something.length();
//        ArrayList<String> mathProblem = new ArrayList<String>();
//        String num = "";
//
//        for (int i = 0; i < length; i++) {
//            char character = something.charAt(i);
//            if (Character.isDigit(character)) {
//                num += character;
//                System.out.println(num);
//                if (i == length - 1) {
//                    mathProblem.add(num);
//                }
//                else {
//                    mathProblem.add(num);
//                    num = "";
//                    String operation = "" + character;
//                    System.out.println(operation);
//                    mathProblem.add(operation);
//                }
//            }
//        }
//
//        System.out.println(mathProblem);
//
//        int size = mathProblem.size();
//
//        for (int i = 0; i < size; i++) {
//            char character = something.charAt(i);
//            System.out.println((character));
//            if (!Character.isDigit(character)) {
//                String operation = "" + character;
//            } else {
//                System.out.println("No Operation");
//            }
//        }

//        //num in int
//        double numOneInt = Integer.parseInt(numOne);
//        double numOneTwo = Integer.parseInt(numTwo);

//        //calculate
//        if (operation.equals("+")){
//            double ansOne = (numOneInt+numOneTwo);
//            System.out.println(ansOne);
//        }
//        else if (operation.equals("-")){
//            double ansOne = (numOneInt-numOneTwo);
//            System.out.println(ansOne);
//        }
//        else if (operation.equals("*")){
//            double ansOne = (numOneInt*numOneTwo);
//            System.out.println(ansOne);
//        }
//        else if (operation.equals("/")){
//            double ansOne = (numOneInt/numOneTwo);
//            System.out.println(ansOne);
//        }
//        else{
//            System.out.println("oops somthing went wrong");
//        }