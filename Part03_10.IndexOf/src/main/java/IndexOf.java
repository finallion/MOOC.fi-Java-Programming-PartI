
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

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

        System.out.print("Search for? ");
        int input = Integer.valueOf(scanner.nextLine());
        int counter = 0;
        
        while (counter < list.size()) {
            int comp = list.get(counter);
            if (input == comp) {
                System.out.println(input + " is at index " + counter);
            } 
            counter++;

        }
    }
}
