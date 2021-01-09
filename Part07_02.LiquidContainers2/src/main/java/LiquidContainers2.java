
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("> ");

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }

            String[] pieces = input.split(" ");
            String command = pieces[0];
            
            int amount = Integer.valueOf(pieces[1]);
            
            if (command.equals("add")) {
                first.add(amount);
            }

            if (command.equals("move")) {
                if (first.contains() - amount < 0){
                    second.add(first.contains());
                    first.remove(amount);
                }

                if (first.contains() - amount >= 0){
                    first.remove(amount);
                    second.add(amount);

                }
            }

            if (command.equals("remove")) {
                second.remove(amount);
            }
        }
    }
}
