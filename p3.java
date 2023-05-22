
import java.util.Scanner;  

public class p3 {
    
  public static void main(String[] args) {
      
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");
    // System.out.println(Integer.parseInt(args[0]));
    int a= myObj.nextInt();  // Read user input
    System.out.println("Username is: " + a);  // Output user input
  }
}

