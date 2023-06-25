
//string

import java.util.Scanner;
public class p3_string {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String firstname=sc.nextLine();
    String lastname=sc.nextLine();
    String fullname=firstname.concat(lastname);
    //String fullname=firstname+lastname;
    System.out.println("Fullname is: "+fullname);

    //char at
    for(int i=0;i<fullname.length();i++){
        System.out.println(fullname.charAt(i));
    }

    //compareTo and ==
    String name1="jay";
    String name2="jay";

   
    //compareTo gives 0 if both strings are equal
    if(name1.compareTo(name2)==0)
    {
        System.out.println("equal");
    }
    else{
        System.out.println("not equal");
    }
//== gives false because it compares the address of the string
//string are immutable so crerates new string in heap memory to store name1 and name2 so address are different
     if(new String(name1)==new String(name2))
    {
        System.out.println("equal");
    }
    else{
        System.out.println("not equal");
    }

    //difference between == and equals and compareTo is
    //== compares the address of the string
    //equals compares the value of the string
    //compareTo compares the value of the string and it ignores the case of the string
    //compareTo gives 0 if both strings are equal and euqals gives true if both strings are equal

    if(name1.equals(name2))
    {
        System.out.println("equal");
    }
    else{
        System.out.println("not equal");
    }

    //substring take begin index and end index and give middle string
    String name="my name is jay";
    System.out.println(name.substring(1,3));

    //
}
       
}




