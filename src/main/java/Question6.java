
import java.util.*;
public class Question6 {
    public static void main(String[] args) {
        Scanner twoNumbers = new Scanner(System.in);

        System.out.println(" Enter the first number ");
        int firstNumber = twoNumbers.nextInt();

        System.out.println(" Enter the second number ");
        int secondNumber = twoNumbers.nextInt();

        int sum = firstNumber + secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int subtraction = firstNumber - secondNumber;

        System.out.println(" The sum is " + sum);
        System.out.println(" The multiplication is " + multiplication);
        System.out.println(" The division is " + division);
        System.out.println(" The subtraction is " + subtraction);

        twoNumbers.close();
    }
}
