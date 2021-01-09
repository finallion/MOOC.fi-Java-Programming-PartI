import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }


    public void add(String taks) {
        todoList.add(taks);
    }

    public void remove(int number){
        todoList.remove(number - 1);
    }

    public void print() {
        int x = 0;
        int counter = 0;

        while (counter < todoList.size()) {
            System.out.print(x + 1 + ": ");
            System.out.println(todoList.get(x));
            x++;
            counter++;
        }
    }
}
