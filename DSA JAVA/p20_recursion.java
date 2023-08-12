public class p20_recursion {

    // Check if a number is prime
    public static boolean prime(int num) {
        //recursion base case
      
    }

    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");
        for (int i = 1; i <= 100; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
