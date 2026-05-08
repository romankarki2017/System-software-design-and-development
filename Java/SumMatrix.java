import java.util.Scanner;
public class SumMatrix{
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        // declare and construct the 2D array
        int[][] matrix1=new int[2][3];
        int[][] matrix2=new int[2][3];
        int[][] resultMatrix=new int[2][3];

        //enter the elements of 1st matrix
        System.out.println("Enter the elements of 1st matrix: ");
        for(int i=0; i<2; i++){
            System.out.println("Enter the elements of row: "+(i+1));
            for (int j=0; j<3; j++){
                matrix1[i][j]=sc.nextInt();

            }
        }
        //Enter the elements of 2nd matrix
        System.out.println("Enter the elements of 2st matrix: ");
        for(int i=0; i<2; i++){
            System.out.println("Enter the elements of row: "+(i+1));
            for (int j=0; j<3; j++){
                matrix2[i][j]=sc.nextInt();

            }
        }
        //find the sum of two matrix
        System.out.println("Enter the elements of 2st matrix: ");
        for(int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                resultMatrix[i][j]=matrix1[i][j]+matrix2[i][j];

            }
        }

        //display the result matrix
        for(int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                System.out.println(resultMatrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    
}