
//bit manipulation

import java.util.Scanner;

public class p2_string {

    public static void main(String[] args) {

        // get bit
        int n = 5; // 0101
        int pos = 3;
        int bitMask = 1 << pos; //make a mask 0010

        if ((bitMask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");

        }

        // set bit
        int n1 = 5; // 0101
        int pos1 = 1;
        int bitMask1 = 1 << pos1; //make a mask 0010
        int ans = n1 | bitMask1;
        System.out.println(ans);
        
       
        //clear bit
        int n2 = 5; // 0101
        int pos2 = 2;
        int bitMask2 = 1 << pos2; //make a mask 0100
        int notMask = ~bitMask2; // 1011
        int ans2 = n2 & notMask;
        System.out.println(ans2);

        //update bit
        int n3 = 5; // 0101
        int pos3 = 1;
        int operation = 1; // 1 for set and 0 for clear

        int bitMask3 = 1 << pos3; //make a mask 0010
        int notMask3 = ~bitMask3; // 1101
        int ans3 = (n3 & notMask3) | (operation << pos3);
        System.out.println(ans3);


    }
}