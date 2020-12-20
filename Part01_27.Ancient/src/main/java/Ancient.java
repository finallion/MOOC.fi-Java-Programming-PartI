
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a year: ");
        int input = Integer.valueOf(scan.nextLine());
        int year = 2015;

        if (input < year) {
            System.out.println("Ancient history!");
        }
    }
}
