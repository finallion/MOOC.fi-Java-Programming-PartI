
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        ArrayList<String> list = new ArrayList<>();

        try ( Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String read = reader.nextLine();
                list.add(read);
                String[] pieces = read.split(",");
                
                if (Integer.valueOf(pieces[1]) == 1) {
                    System.out.println(pieces[0] + ", age: " + pieces[1] + " year");
                } else {
                    System.out.println(pieces[0] + ", age: " + pieces[1] + " years");
                }
            }

        } catch (Exception e) {
            System.out.println("Error!");
        }

    }
}
