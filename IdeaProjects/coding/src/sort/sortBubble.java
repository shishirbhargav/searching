package sort;

/**
 * Created by shishirbhargav on 10/8/15.
 */
public class sortBubble {

    static void printArray(int[] array){
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

    public static void main(String[] argv){

        int[] array = {3,5,6,2,1,7,9,8};
        int n = array.length;

        for (int i = 0; i < n; i++){
            for (int j = i+1 ; j < n; j++){

                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }

        printArray(array);
    }
}
