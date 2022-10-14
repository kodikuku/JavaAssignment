
import java.util.*;
public class Question7 {
    public static void main(String[] args) {

        Scanner inputTime = new Scanner (System.in);
        System.out.println(" Please enter the time in seconds ");
        int inputSeconds = inputTime.nextInt();

        int sec = inputSeconds % 60;
        int hours = inputSeconds / 60;
        int minutes = hours % 60;
        hours = hours / 60;

        System.out.println(hours + ":" + minutes + ":" + sec);
    }
}
