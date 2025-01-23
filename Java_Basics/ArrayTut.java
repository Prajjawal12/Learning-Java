package Java_Basics;

// An array is a collection of similar types of data stored in contiguous memory locations.
// Arrays are used to store multiple values in a single variable.


import java.util.Arrays;

public class ArrayTut {
   
    // 1. Initializing arrays in Java
    private static void initializeArrays() {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] nums = new int[5];
        nums[0] = 10;
        nums[1] = 20;

        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    // 2.Multidimensional Arrays in Java
    private static void multiDimensionalArrays() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Element at (1,1): " + matrix[1][1]); // Output: 5

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    

    //3. Jagged Array in java :- Jagged array is an array of arrays where members can have different sizes
    private static void jaggedArrays() {
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[]{1, 2};
        jaggedArray[1] = new int[]{3, 4, 5};
        jaggedArray[2] = new int[]{6};

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    //4. Using the Arrays class in Java
    private static void arraysClassDemo() {
        int[] array = {5, 2, 8, 1, 3};

        // Sort the array
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Fill the array with a specific value
        Arrays.fill(array, 10);
        System.out.println("Array after fill: " + Arrays.toString(array));

        // Binary search (array must be sorted)
        int[] sortedArray = {1, 3, 5, 7, 9};
        int index = Arrays.binarySearch(sortedArray, 5);
        System.out.println("Index of 5: " + index);
    }
    //5. A final array i.e an array with final keyword
    // We cannot make the final array refer to another array, but we can change the data within the array.
    private static void finalArrayDemo() {
        final int[] finalArray = {1, 2, 3};

        finalArray[0] = 10;
        System.out.println("Modified final array: " + Arrays.toString(finalArray));

        // If we uncomment the line below,it will show a  compile-time error
        // finalArray = new int[]{4, 5, 6};
    }

    public static void main(String[] args) {
        initializeArrays();
        multiDimensionalArrays();
        jaggedArrays();
        arraysClassDemo();
        finalArrayDemo();
    }
}