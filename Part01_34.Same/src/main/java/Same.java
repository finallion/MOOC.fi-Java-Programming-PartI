
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the first string: ");
        String inputOne = scan.nextLine();

        System.out.println("Enter the second string: ");
        String inputTwo = scan.nextLine();

        if (inputOne.equals(inputTwo)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        } 
    }
}
