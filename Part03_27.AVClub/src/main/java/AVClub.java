
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            String[] pieces = input.split(" ");

            for (int x = 0; x < pieces.length; x++) {
                if (pieces[x].contains("av")) {
                    System.out.println(pieces[x]);
                }
            }

            if (input.equals("")) {
                break;
            }
        }
    }
}
