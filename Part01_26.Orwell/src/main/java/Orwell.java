
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a number: ");
        int input = Integer.valueOf(scan.nextLine());
        int orwellYear = 1984;

        if (input == orwellYear) {
            System.out.println("Orwell");
        }
    }
}
