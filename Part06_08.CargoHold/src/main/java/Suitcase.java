import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        int suitcaseWeight = 0;
        
        for (Item i : items) {
            suitcaseWeight += i.getWeight();
        }

        if ((this.maxWeight - suitcaseWeight) >= item.getWeight()) {
            this.items.add(item);
        }
    }

 
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        Item helper = this.items.get(0);
        for (Item item : items) {
            if (item.getWeight() > helper.getWeight()) {
                helper = item;
            }
        }
        return helper;
    }


    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int size() {
        return items.size();
    }

    public int totalWeight() {
        int totalWeight = 0;
        
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

 

    public String toString() {
        int suitcaseWeight = 0;

        for (Item item : items) {
            suitcaseWeight += item.getWeight();
        }

        if (this.items.isEmpty()) {
            return "no items (" + suitcaseWeight + " kg)";
        }

        if (this.items.size() == 1) {
            return "1 item (" + suitcaseWeight + " kg)";
        }

        return this.items.size() + " items (" + suitcaseWeight + " kg)";
    }
}
