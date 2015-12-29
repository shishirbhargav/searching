package sort;

public class sortQuick {

    public static void main(String[] argv){

        int[] array = {4,5,3,6,2,7,1,8,9,0};
        int n = array.length;

        sort(array,0, n-1);

        for (int i = 0; i < n; i++)
            System.out.println(array[i]);
    }

    static void sort(int[] array,int low, int high){

        if (low < high) {
            int pivot = partition(array, low, high);
            sort(array, low, pivot - 1);
            sort(array, pivot, high);
        }
    }

    static int partition(int[] array, int low, int high){

        int pivot = array[high];
        int index = low;

        for (int i = low; i < high; i++){
            if (array[i] <= pivot){
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;

                index++;
            }
        }

        int temp = array[index];
        array[index] = array[high];
        array[high] = temp;

        return index;
    }
}