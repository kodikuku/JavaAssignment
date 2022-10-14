import java.util.*;
public class Question5 {
    public static void main(String[] args) {

        Scanner userName = new Scanner (System.in);

        System.out.println(" Enter the user name ");

        String inputName = userName.nextLine();

        System.out.println(" Hello " + inputName);

        userName.close();

    }
}
