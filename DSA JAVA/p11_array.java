// rearrange array with O(1) extra space
// input: 4 0 2 1 3
// output: 3 4 2 0 1
//approach: 1. store a = a + (b % n) * n
//so new array is 19 20 12 0 1
// now to get b = a / n

import java.util.*;
import java.io.*;
import java.lang.*;

public class p11_array {
   public static void main(String[] args) {
    
    int[] arr = {4, 0, 2, 1, 3};
    int n = arr.length; 
    for(int i = 0; i < n; i++) {  
        int x= arr[i];
        int y = arr[x];
        arr[i] = x + (y % n) * n;
    }
    for(int i = 0; i < n; i++) {
        arr[i] = arr[i] / n;
    }
    System.out.println(Arrays.toString(arr));
   }  m,,  
    
}
