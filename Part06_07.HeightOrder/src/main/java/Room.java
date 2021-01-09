import java.util.ArrayList;

public class Room {
    private ArrayList<Person> rooms;

    public Room() {
        this.rooms = new ArrayList<>();
    }

    public void add(Person person) {
        this.rooms.add(person);
    }


    public boolean isEmpty() {
        if (this.rooms.isEmpty()) {
            return true;
        }
        return false;
    }

 
    public ArrayList<Person> getPersons() {
        return this.rooms;
    }

    public Person shortest() {
        if (isEmpty()) {
            return null;
        }

        Person shortest = this.rooms.get(0);
        
        for (Person person : rooms) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }

    public Person take() {
        if (isEmpty()) {
            return null;
        }

        Person isShortest = this.shortest();
        this.rooms.remove(isShortest);
        return isShortest;
    }

}
