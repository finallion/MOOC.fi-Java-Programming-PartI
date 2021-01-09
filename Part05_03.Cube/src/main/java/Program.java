
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cube cubeOne = new Cube(6);

        System.out.println(cubeOne.volume());
        System.out.println(cubeOne);
    }
}
