
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int firstInput = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number: ");
        int secondInput = Integer.valueOf(scanner.nextLine());

        double sum = (double) firstInput + secondInput;

        System.out.println("The average is " + sum/2);

    }
}
