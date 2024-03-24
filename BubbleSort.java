/**
 *
 * @author MoaathAlrajab
 */
import java.io.OptionalDataException;
import java.util.Arrays;
public class BubbleSort {


    public static void bubbleSort(int a[], int size) {
        //  time complexity of the Bubble Sort algorithm in the worst and average cases is O(n^2)
        // in the best case (when the array is already sorted), the time complexity is O(n) if an optimization is added to check if any swaps were made in the inner loop;
        // if no swaps were made, the algorithm can be stopped early as the array is already sorted
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) {
            // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                if (a[inner] > a[inner+1]) {
                    temp = a[inner];
                    a[inner] = a[inner+1];
                    a[inner+1] = temp;
                }
                //ToDo 3: complete this algorithm, test it, provide its time complexity
            }
        }
    }
    public static void main(String[] args) {


        int[] array = {5, 3, 8, 1, 2}; // Unsorted array
        int size = array.length;
        BubbleSort.bubbleSort(array, size);


        System.out.println("Array sorted with bubble sort: ");
        System.out.println(Arrays.toString(array));








    }


}
