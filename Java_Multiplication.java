import java.util.Scanner;

public class CheckingLab4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Matrix A
        System.out.print("Enter your number of rows of A: ");
        int rowsA = input.nextInt();
        System.out.print("Enter number of columns of A: ");
        int colA = input.nextInt();

        int[][] A = new int[rowsA][colA];

        System.out.println("Enter your Matrix A: ");
        for(int i=0;i<rowsA;i++){
            for(int j=0;j<colA;j++){
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("Matrix A is: ");
        for(int i=0;i<rowsA;i++){
            for(int j=0;j<colA;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }


        //Matrix B
        System.out.print("Enter your number of rows of B: ");
        int rowsB = input.nextInt();
        System.out.print("Enter number of columns of B: ");
        int colB = input.nextInt();

        int[][] B = new int[rowsB][colB];

        System.out.println("Enter your Matrix B: ");
        for(int i=0;i<rowsB;i++){
            for(int j=0;j<colB;j++){
                B[i][j] = input.nextInt();
            }
        }

        System.out.println("Matrix B is: ");
        for(int i=0;i<rowsB;i++){
            for(int j=0;j<colB;j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
        }

        //MULTIPLICATION
        int sum =0;
        int[][] C = new int[100][100];
        for(int i=0;i<rowsA;i++){
            for(int j=0;j<colB;j++){
                for(int k=0;k<rowsA;k++){

                   sum = sum + A[i][k] * B[k][j];

                }
                C[i][j] = sum;
            }
        }


        System.out.println("After Multiplication;");
        for(int i=0;i<rowsA;i++){
            for(int j=0;j<colB;j++){

                System.out.print(C[i][j]+ " ");

            }
            System.out.println("");

        }
    }
}
