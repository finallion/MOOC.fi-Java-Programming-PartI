import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }

    public void start(){
        while (true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if(command.equals("stop")){
                break;
            }

            if(command.equals("add")){
                System.out.print("To add: ");
                String add = scanner.nextLine();
                list.add(add);

            } else if (command.equals("list")){
                list.print();
            } else if (command.equals("remove")){
                System.out.print("Which one is removed? ");
                String remove = scanner.nextLine();
                list.remove(Integer.valueOf(remove));
            }
        }
    }  
}
