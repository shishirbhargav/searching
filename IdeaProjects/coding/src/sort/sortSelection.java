package sort;

/**
 * Created by shishirbhargav on 10/8/15.
 */
public class sortSelection {

    static void printArray(int[] array){

        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
    public static void main(String[] argv){

        int[] array = {8, 4, 6, 3, 9, 1, 2, 5, 7, 0};
        int n = array.length;

        for (int i = 0; i < n; i++){
            int minPos = array[i];
            for (int j = i+1 ; j < n; j++){
                if (array[minPos] > array[j])
                    minPos = j;
            }
            int temp = array[i];
            array[i] = array[minPos];
            array[minPos] = temp;
        }

        printArray(array);
    }
}
