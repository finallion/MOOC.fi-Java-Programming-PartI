
public class StarSign {
 
    public static void main(String[] args) {

        printStars(3);
        System.out.println("\n---"); 
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---"); 
    }

    public static void printStars(int number) {
        int x = 0;
        while (x < number) {
            System.out.print("*");
            x++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int y = 1;
        while (y <= size) {
            printStars(size);
            y++;
        }
    }

    public static void printRectangle(int width, int height) {
        int z = 1;
        while (z <= height) {
            printStars(width);
            z++;
        }
    }

    public static void printTriangle(int size) {
        int a = 1;
        while (a <= size) {
            printStars(a);
            a++;
        }
    }
}
