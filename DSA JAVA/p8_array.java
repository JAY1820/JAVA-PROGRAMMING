//transpose matrix
import java.util.Scanner;
public class p8_array {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        int a[][] = new int[rows][cols];

        System.out.println("Enter the elements of the matrix: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        
        //transpose main logic
        System.out.println("The transpose of the matrix is: ");
        for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
         
    }     
}
