
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counter = 0;
        int sum = 0;
        int nameLength = 0;
        String name = "";

        while (true) {
            String input = scanner.nextLine();
            String[] pieces = input.split(",");

            if (input.equals("")) {
                System.out.println("Longest name: " + name);
                System.out.println("Average of the birth years: " + (double) sum / counter);
                break;
            }

            sum += Integer.valueOf(pieces[1]);
            counter++;

            if (pieces[0].length() > nameLength) {
                nameLength = pieces[0].length();
                name = pieces[0];
            }
        }
    }
}
