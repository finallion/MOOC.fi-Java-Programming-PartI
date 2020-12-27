
public class SumOfArray {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        int counter = 0;
        int sum = 0;
        while (counter < array.length) {
            sum += array[counter];
            counter++;
        }
        return sum;
    }
}
