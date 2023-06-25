//Take an array of numbers as input and check if it is an array sorted in ascending order.
//If it is not sorted in ascending order then sort the array in ascending order.

import java.util.*;
public class p6_array {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("Enter the size of array: ");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array: ");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int flag=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]>arr[i+1])
            {
                flag=1;
                break;
            }

        }
        if(flag==1)
        {
            Arrays.sort(arr);
            System.out.println("The sorted array is: ");
            for(i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        else
        {
            System.out.println("The array is already sorted in ascending order.");
        }

    }

}
