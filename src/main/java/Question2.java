import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        //Create a program that takes a year as input
        //from user and print if it's leap year or not.
        Scanner leap = new Scanner(System.in);
        int year;
        System.out.println(" Enter the year to check if it is leap year or not ");
        year = leap.nextInt();
        if(year % 4 == 0) {
            System.out.println("It is a leap year");
        }
        else {
            System.out.println("It is not a leap year");
        }
        leap.close();
    }
}
