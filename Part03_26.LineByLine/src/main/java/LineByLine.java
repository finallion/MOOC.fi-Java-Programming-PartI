
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            String[] pieces = input.split(" ");

            for (int x = 0; x < pieces.length; x++) {
                System.out.println(pieces[x]);
            }

            if (input.equals("")) {
                break;
            }
        }
    }
}
