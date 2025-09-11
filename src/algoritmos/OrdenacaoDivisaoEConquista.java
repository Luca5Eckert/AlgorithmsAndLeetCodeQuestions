package algoritmos;

import java.util.Arrays;

import static java.lang.System.currentTimeMillis;


public class OrdenacaoDivisaoEConquista {

    public static void main(String[] args) {
        int[] array = new int[]{2,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,22,3,21,1,2};

        System.out.println(Arrays.toString(array));
        System.out.println(currentTimeMillis());

        sortArray(array);

        System.out.println(Arrays.toString(array));
        System.out.println(currentTimeMillis());

    }

    public static void sortArray(int[] array){
        if(array.length <= 1){
            return;
        }
        mergeRecursive(array, 0, array.length-1);

    }

    private static void mergeRecursive(int[] array, int left, int right) {
        if(left < right){

            int mid = left + (right - left) / 2;

            mergeRecursive(array, left, mid);
            mergeRecursive(array, mid + 1, right);

            merge(array, left, mid, right);

        }
    }

    public static int[] merge(int[] array, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] l = new int[n1 + 1];
        int[] r = new int[n2 + 1];

        for(int i = 0; i < n1; i++){
            l[i] = array[left + i];
        }
        for(int i = 0; i < n2; i++){
            r[i] = array[mid + 1 + i ];
        }

        l[n1] = Integer.MAX_VALUE;
        r[n2] = Integer.MAX_VALUE;


        int i = 0, j = 0;
        for (int k = left; k <= right; k++) {
            if (l[i] <= r[j]) {
                array[k] = l[i];
                i++;
            } else {
                array[k] = r[j];
                j++;
            }
        }

        return array;
    }


}