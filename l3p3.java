import java.util.Scanner;
import java.nio.charset.Charset;
public class l3p3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String str1 = new String();
        System.out.print("Enter First String:");
        str1 = scan.nextLine();
        System.out.println("String1:" + str1);

        // String("") is constructor
        System.out.print("Enter Second String:");
        String str2 = new String(scan.nextLine());
        System.out.println("String2:" +str2);
        
        //Constructor call with char Array
        char ch[] = { 'h', 'e', 'l', 'l', 'o' };
        String str3 = new String(ch);
        System.out.println("char Array:"+str3);

        //Constructor call with Byte Array
        byte[] arr = { 65, 66, 67, 68 };
        String str4 = new String(arr);
        System.out.println("Byte Array:"+str4);
        //Constructor call with Byte Array with charset
        byte[] bArr = { 72,69 ,76 ,76,79 };
        Charset ch1 = Charset.defaultCharset();
        String str5 = new String(bArr, ch1);
        System.out.println("Byte Array with charset:"+str5);
        // Constructor call with Byte Array and Substring
        byte[] arr1 = {72,69,76,76,79};
        String str6 = new String(arr1, 1, 3);
        System.out.println("SubStirng:"+str6);
        // Constructor call with char Array and Substring
        char ch2[] = { 'h', 'e', 'l', 'l', 'o' };
        String str7 = new String(ch2, 2, 3);
        System.out.println(str7);


        //Constructor of StringBuffer 
        StringBuffer sb = new StringBuffer("Java");
        String str8 = new String(sb);
        System.out.println("StringBuffer:"+str8);

        
        // Constructor StringBuilder
        StringBuilder sB = new StringBuilder("Java2");
        String str9String = new String(sB);
        System.out.println("StringBuilder"+str9String);




        // String Class Methods
        System.out.println("CharAt Method:"+str1.charAt(0));
        System.out.println("length Method:"+str2.length());
        System.out.println("Compareto Method:"+str1.compareTo(str2));
        System.out.println("Concat Method:"+str1.concat(str2));
        System.out.println("remove space"+str1.trim());

        System.out.println("covert to lower case"+str1.toLowerCase());
        System.out.println("covert to upper case"+str1.toUpperCase());
        System.out.println("The substring method  " + str1.substring(4));
        System.out.println("The substring with two areguments " + str1.substring(10, 18));
        System.out.println("equal method  " + str1.equals(str2));
    }
}  