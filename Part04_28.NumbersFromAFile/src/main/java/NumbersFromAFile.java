
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        ArrayList<Integer> numbers = new ArrayList<>();
        int counter = 0; 

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                numbers.add(Integer.valueOf(reader.nextLine()));
            }

            for (Integer integer: numbers) {
                if (integer >= lowerBound && integer <= upperBound) {
                    counter++;
                }
            }
            System.out.println("Numbers: " + counter);
            
        } catch (Exception e) {
            System.out.println("Error!");
        }

    }

}
