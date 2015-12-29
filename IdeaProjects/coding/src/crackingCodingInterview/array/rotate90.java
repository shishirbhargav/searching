package crackingCodingInterview.array;

/**
 * Created by shishirbhargav on 12/28/15.
 */
public class rotate90 {

    static int[][] matrix = {{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};

    public static void main(String[] argv){

        System.out.println("Matrix before rotation");
        printMatrix();
        System.out.println("Matrix after rotation");
        rotateMatrix();
        printMatrix();
    }

    static void printMatrix(){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void rotateMatrix(){
        for (int layer = 0 ; layer < matrix.length/2; layer++){

            int first = layer;
            int last  = matrix.length - 1 - layer;

            for (int i = first; i < last; i++){

                int offset = i - first;
                int top = matrix[first][i];

                // left to top
                matrix[first][i] = matrix[last - offset][first];
                // bottom to left
                matrix[last-offset][first] = matrix[last][last - offset];
                // right to bottom
                matrix[last][last - offset] = matrix [i][last];
                // top to right
                matrix[i][last] = top;
            }
        }
    }
}
