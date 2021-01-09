public class Stack {
    private ArrayList<String> stacks;

    public Stack() {
        this.stacks = new ArrayList<>();
    }


    public boolean isEmpty() {
        if (stacks.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void add(String value) {
        stacks.add(value);
    }


    public ArrayList<String> values() {
        return stacks;
    }

    
    public String take() {
        return stacks.remove(stacks.size() -1);
    }


}
