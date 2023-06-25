//Find the maximum & minimum number in an array of integers. 

import java.util.*;

public class p5_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n;
        System.out.println("Enter the size of array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(i=0;i<n;i++)
        {

            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }

        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
        sc.close();
    }

}