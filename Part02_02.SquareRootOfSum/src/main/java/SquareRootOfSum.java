
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputOne = Integer.valueOf(scanner.nextLine());
        int inputTwo = Integer.valueOf(scanner.nextLine());
        int sum = inputOne + inputTwo;
        double squareRoot = Math.sqrt(sum);
        System.out.println(squareRoot);

    }
}
