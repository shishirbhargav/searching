package crackingCodingInterview.array;

/**
 * Created by shishirbhargav on 12/28/15.
 */
public class setColumnRowToZero {

    static int[][] matrix = {
                            {1,1,0,1},
                            {1,0,1,1},
                            {1,1,1,1},
                            };

    public static void main(String[] argv){

        System.out.println("Matrix before conversion");
        printMatrix();
        System.out.println("Matrix after conversion");
        evaluateMatrix();
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

    static void evaluateMatrix(){
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];

        for (int i = 0; i < row.length; i++){
            for (int j = 0; j < col.length; j++){
                if (matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < row.length; i++){
            for (int j = 0; j < col.length; j++){
                if (col[j] == 1 || row[i] == 1){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
