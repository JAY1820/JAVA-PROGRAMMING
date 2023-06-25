//2d array print and find a given element and print its index

import java.util.Scanner;

public class p7_array {

    Scanner sc = new Scanner(System.in);
    int[][] arr = new int[3][5];
    int i, j;

    void input() {
        System.out.println("Enter the elements of array: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    void display() {
        System.out.println("The elements of array are: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

int find(int x)
{
    for(i=0;i<3;i++)
    {
        for(j=0;j<5;j++)
        {
            if(arr[i][j]==x)
            {
                System.out.println("The element is found at index: "+i+" "+j);   
                return 1;
            }
        }
    }
    return 0;
}

    public static void main(String[] args) {
        p7_array obj = new p7_array();
        obj.input();
        obj.display();
        int x;
        System.out.println("Enter the element to be searched: ");
        x = obj.sc.nextInt();
        int ans = obj.find(x);

    }

}
