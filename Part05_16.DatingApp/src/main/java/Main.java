
public class Main {

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(0, 0, 0);

        date.advance();
        date.advance();
        System.out.println(date);

        date.advance(7);
        System.out.println(date);

        SimpleDate clone = date.afterNumberOfDays(9);
        System.out.println(clone);
    }
}
