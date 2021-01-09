
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SimpleDictionary dict = new SimpleDictionary();
        TextUI ui = new TextUI(scanner, dict);
        ui.start();

        System.out.println(dict.translate("pike"));
    }
}
