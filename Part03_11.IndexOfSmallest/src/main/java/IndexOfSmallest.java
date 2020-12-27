
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            numbers.add(input);
        }

        int start = numbers.get(0);
        
        for (int x = 0; x < numbers.size(); x++) {
            int comp = numbers.get(x);
            if (start > comp) {
                start = comp;
            }
        }

        System.out.println("Smallest number: " + start);

        
        for (int x = 0; x < numbers.size(); x++) {
            int comp = numbers.get(x);
            if (start == comp) {
                System.out.println("Found at index: " + x);
            }
        }   
    }
}
