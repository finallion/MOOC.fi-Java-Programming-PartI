
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");

        int first = Integer.valueOf(scanner.nextLine());
        int sum = 1;

        for (int x = 1; x <= first; x++) {
            sum = sum * x;
        }
        
        System.out.println("The sum is " + sum);
    }
}
