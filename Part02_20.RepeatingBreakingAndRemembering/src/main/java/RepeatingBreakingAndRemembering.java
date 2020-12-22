
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");

        int sum = 0;
        int counter = 0;
        int counterEven = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            sum += input;
            counter++;

            if (input % 2 == 0) {
                counterEven++;
            } 
        }
        
        int oddNumbers = counter - counterEven;
        double average = (double) sum / countOfNumbers;

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + average);
        System.out.println("Even: " + counterEven);
        System.out.println("Odd: " + counterOdd);

    }
}
