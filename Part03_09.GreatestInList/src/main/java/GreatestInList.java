
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        int greatest = list.get(0);
        for (int x = 0; x < list.size(); x++) {
            if (greatest < list.get(x)) {
                greatest = list.get(x);
            }
        }

        System.out.println("The greatest number: " + greatest);
    }
}
