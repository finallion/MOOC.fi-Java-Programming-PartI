
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number? ");

        int inputLastNumber = Integer.valueOf(scanner.nextLine());

        int sum = 0;
        int number = 1;

        while (number <= inputLastNumber) {
            sum += number;
            number++;
        }

        System.out.println("The sum is " + sum);

    }
}
