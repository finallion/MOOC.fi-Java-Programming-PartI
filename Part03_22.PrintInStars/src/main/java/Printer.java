
public class Printer {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[index] == array[i]) {
                for (int x = 0; x < array[i]; x++) {
                    System.out.print("*");
                }
                index++;
            }
            System.out.println("");
        }
    }
}
