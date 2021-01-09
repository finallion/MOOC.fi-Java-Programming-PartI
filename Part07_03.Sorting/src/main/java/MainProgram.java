
public class MainProgram {

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 99, 3, 12};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array) {
        int x = array[0];
        for (int value : array) {
            if (x > value) {
                x = value;
            }
        }
        return x;
    }

 
    public static int indexOfSmallest(int[] array) {
        int x = MainProgram.smallest(array);

        for (int helper = 0; helper < array.length; helper++) {
            if (array[helper] == x) {
                return helper;
            }
        }
        return -1;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int x = startIndex;
        int[] subArray = new int[array.length - startIndex];
        
        for (int helper = 0; helper < subArray.length; helper++) {
            subArray[helper] = array[x];
            x++;
        }
        return startIndex + indexOfSmallest(subArray);
    }

    public static void swap(int[] array, int index1, int index2) {
        int x = array[index1];
        array[index1] = array[index2];
        array[index2] = x;
        System.out.println(Arrays.toString(array));
    }


    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }
}
