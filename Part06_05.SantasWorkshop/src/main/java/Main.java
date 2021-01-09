
public class Main {

    public static void main(String[] args) {

        Gift book = new Gift("xy", 2);
        book.getName();
        book.getWeight();
        System.out.println(book);

        Gift bookTwo = new Gift ("za", 6);

        Package gifts = new Package();
        
        gifts.addGift(book);
        gifts.addGift(bookTwo);

        System.out.println(gifts.totalWeight());

    }
}
