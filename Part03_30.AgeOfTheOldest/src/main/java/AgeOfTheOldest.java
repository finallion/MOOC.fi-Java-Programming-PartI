
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 0;
        while (true) {
            String input = scanner.nextLine();
            String[] parts = input.split(",");

            if (input.equals("")) {
                System.out.println("Age of the oldest: " + x);
                break;
            }

            
            int helper = Integer.valueOf(parts[1]);
            if (helper > x) {
                x = helper;
            }
        }     
    }
}
