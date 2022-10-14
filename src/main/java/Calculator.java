
import java.util.*;
public class Calculator {
    public static void addition() {
        Scanner add = new Scanner (System.in);
        int a, b, sum =0;
        System.out.println(" Enter the first number ");
        a = add.nextInt();
        System.out.println(" Enter the second number ");
        b = add.nextInt();

        sum = a + b;

        System.out.println(" The sum of " + a + " and " + b + " is " + sum);
        add.close();
    }

    public static void subtraction() {
        Scanner subtract = new Scanner (System.in);
        int first, second, difference = 0;
        System.out.println(" Please enter the first number ");
        first = subtract.nextInt();
        System.out.println(" Please enter the second number ");
        second = subtract.nextInt();

        difference = first - second;
        System.out.println(" The difference between " + first + " and " + second + " is " + difference);
        subtract.close();
    }
    public static void multiplication() {
        Scanner multiply = new Scanner (System.in);
        int firstNumber, secondNumber, multi = 0;
        System.out.println(" Enter the first number to multiply ");
        firstNumber = multiply.nextInt();
        System.out.println(" Enter the second number to multiply ");
        secondNumber = multiply.nextInt();

        multi = firstNumber * secondNumber;
        System.out.println(" The product of " + firstNumber + " and " + secondNumber + " is " + multi);
        multiply.close();
    }
    public static void division() {
        Scanner div = new Scanner (System.in);
        int num1, num2, divi = 0;
        System.out.println(" Enter first number to divide ");
        num1 = div.nextInt();
        System.out.println(" Enter the second number to divide ");
        num2 = div.nextInt();
        divi = num1 / num2;

        System.out.println(" The division of " + num1 + " and " + num2 + " is " + divi);
        div.close();
    }
    public static void main(String[] args) {

        System.out.println(" Please choose what you want the program to do ");
        System.out.println(" 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Exit ");
        Scanner choose = new Scanner (System.in);
        int chosen =choose.nextInt();
        switch(chosen) {
            case 1:
                addition();
                break;
            case 2:
                subtraction();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                division();
                break;
            case 5:
                System.out.println(" Thank you for running this program ");
                System.exit(chosen);

                break;
        }
        choose.close();
    }


}
