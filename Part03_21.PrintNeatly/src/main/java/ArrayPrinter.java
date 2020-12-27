
public class ArrayPrinter {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int counter = 0;
        while (counter < array.length) {
            if (counter == array.length - 1) {
                System.out.println(array[counter]);
                counter++;
            } else {
                System.out.print(array[counter] + ", ");
                counter++;
            }

        }
    }
}
