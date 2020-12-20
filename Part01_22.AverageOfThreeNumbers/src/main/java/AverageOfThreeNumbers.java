
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int firstInput = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number: ");
        int secondInput = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number: ");
        int thirdInput = Integer.valueOf(scanner.nextLine());

        double sum = (double) firstInput + secondInput + thirdInput;

        System.out.println("The average is " + sum/3);

    }
}
