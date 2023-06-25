//string builder 

import java.util.Scanner;

public class p4_string {
    public static void main(String[] args) {
        
        StringBuilder str=new StringBuilder("jay");
        System.out.println(str);
        //char at index 0
        System.out.println(str.charAt(0));

        //set char at index 0
        str.setCharAt(0,'m');
        System.out.println(str);

        //insert at index 0
        str.insert(0,'j');
        System.out.println(str);

        //delete at index 1
        str.deleteCharAt(1);

        //append
        str.append('m');
        str.append("i");
        str.append("n");
        System.out.println(str);

        //reverse
        str.reverse();
        System.out.println(str);

        //REVERSE using loop
       for(int i=0;i<str.length()/2;i++)
       {
        int front=i;
        int back=str.length()-i-1; //6-0-1=5
    
        char frontChar=str.charAt(front);
        char backChar=str.charAt(back);

        str.setCharAt(front, backChar);
        str.setCharAt(back, frontChar);
       }
         System.out.println(str);
         
         //

    }
    
}
