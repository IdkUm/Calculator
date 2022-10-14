import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        //ask user for the calculation
        Scanner calculation = new Scanner(System.in);
        System.out.println("pleas enter your four function calculation");
        String userCalculation = calculation.nextLine();
        System.out.println(userCalculation);

        //convert to int and remove spaces
        String something = userCalculation;
        int length = something.length();
        ArrayList<String> mathProblem = new ArrayList<String>();
        String num = "";

        for (int i = 0; i < length; i++) {
            char character = something.charAt(i);
            if (Character.isDigit(character)) {
                num += character;
                if (i == length - 1) {
                    mathProblem.add(num);
                }
            } else {
                mathProblem.add(num);
                num = "";
                String operation = "" + character;
                mathProblem.add(operation);
            }
        }

        System.out.println(mathProblem);

        int size = mathProblem.size();
        for (int i = 0; i < size; i++) {
            char character = something.charAt(i);
            if (!Character.isDigit(character)) {
                String operation = "" + character;
            } else {
                System.out.println("no oporator");
            }
        }
    }
}
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