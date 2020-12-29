
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed?");
        String name = scanner.nextLine();

        try(Scanner reader = new Scanner(Paths.get(name))) {
            while (reader.hasNextLine()) {
                String text = reader.nextLine();
                System.out.println(text);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
