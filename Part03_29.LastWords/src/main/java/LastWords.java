
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            String[] fragment = input.split(" ");

            if (input.equals("")) {
                break;
            }

            int last = fragment.length - 1;
            System.out.println(fragment[last]);   

        }
    }
}
