package sort;

/**
 * Created by shishirbhargav on 10/8/15.
 */
public class sortMerge {
    public static void main(String[] argv){
        int[] array = {5,4,6,3,7,2,8,1,0,9};
        int n = array.length;
        int[] temp = new int[n];

        sort(0,n-1,array,temp);

        for (int i = 0; i < n ; i++)
            System.out.println(array[i]);
    }

    static void sort(int low, int high, int[]array, int[] temp){

        if (low < high){

            int mid = (high + low)/2;
            sort(low, mid, array, temp);
            sort(mid+1, high, array,temp);
            merge(low, mid, high, array, temp);
        }

    }

    static void merge(int low, int mid, int high, int[] array, int[] temp){

        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j<= high){
            if (array[i] <= array[j])
                temp[k++] = array[i++];
            else
                temp[k++] = array[j++];
        }

        while (i <= mid)
            temp[k++] = array[i++];

        while (j <= high)
            temp[k++] = array[j++];

        for (int m = low; m <= high ; m++)
            array[m] = temp[m];
    }
}
