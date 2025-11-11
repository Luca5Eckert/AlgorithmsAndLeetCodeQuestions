package algoritmos;

import java.util.Arrays;

public class QuickSort {


    public void sort(int[] array, int low, int high){
        if(low < high){
            int indexPivot = partition(array, low, high);

            sort(array, low, indexPivot-1);
            sort(array, indexPivot+1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1; // Index of smaller element

        // Iterate j from 'low' up to (but not including) 'high' (the pivot)
        for(int j = low; j < high; j++){
            if(array[j] <= pivot){
                i++; // Increment index of smaller element

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap the pivot element (array[high]) with the element at array[i+1]
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;

        return i+1; // Return the final partition index
    }


    public static void main(String[] args) {
        QuickSort sort = new QuickSort();

        int[] array = new int[]{1,3,4,5,2,1};

        sort.sort(array, 0, 5);

        // Correct way to print the array contents
        System.out.println(Arrays.toString(array));
    }
}
