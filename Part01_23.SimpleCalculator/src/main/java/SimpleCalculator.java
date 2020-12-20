
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number: ");
        int firstInput = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number: ");
        int secondInput = Integer.valueOf(scanner.nextLine());

        int addition = firstInput + secondInput;
        int substraction = firstInput - secondInput;
        int multiplication = firstInput * secondInput;
        double division = (double) firstInput / secondInput;
        
        System.out.println(firstInput + " + " + secondInput + " = " + addition);
        System.out.println(firstInput + " - " + secondInput + " = " + substraction);
        System.out.println(firstInput + " * " + secondInput + " = " + multiplication);
        System.out.println(firstInput + " / " + secondInput + " = " + division);

    }
}
