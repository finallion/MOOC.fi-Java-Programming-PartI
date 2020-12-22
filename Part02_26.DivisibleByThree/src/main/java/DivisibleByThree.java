
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(9, 12);
    }
    
    public static void divisibleByThreeInRange(int beginning, int end) {
        while (beginning <= end) {
            int remainder = beginning%3;
            if (remainder == 0) {
                System.out.println(beginning);
            }
            beginning++;
        }

    }

}
