
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int first = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Last number?");
        int last = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;

        while (first <= last) {
            sum = sum + first;
            first++;
        }

        //with for-loop
        /*for (int x = first; x <= last; x++) {
            sum += x;
        } */

        System.out.println("The sum is " + sum);

    }
}
