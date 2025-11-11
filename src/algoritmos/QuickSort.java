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
        int i = low - 1;

        for(int j = low; j < high; j++){
            if(array[j] < pivot){
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;

        return i+1;
    }


    public static void main(String[] args) {
        QuickSort sort = new QuickSort();

        int[] array = new int[]{1,3,4,5,2,4,4,32,32,3,2,32,42,43,43,2,4,23,2,43,243,42,1};

        sort.sort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));
    }
}
