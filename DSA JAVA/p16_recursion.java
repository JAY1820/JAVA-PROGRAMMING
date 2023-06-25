//recusion

public class p16_recursion {

    public static void printnumber(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printnumber(n - 1);
    }

    public static void printnumber2(int n) {
        // no is even print even no
        if (n == 0) {
            return;
        }
        if (n % 2 == 0) {
            System.out.println(n);
        }
        printnumber2(n - 1);
        if (n % 2 != 0) {
            System.out.println(n);
        }

    }

    public static void printnumber3(int i, int n, int sum)

    {
        if (i == n) {
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        printnumber3(i + 1, n, sum);

    }

    public static int calcuatefactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int ans = calcuatefactorial(n - 1);
        int fac = n * ans; // 3!= 3*2!
        return fac;

    }

    public static void fibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        fibonacci(b, c, n - 1);

        /*
         * another way to do this
         * 
         * public static void fibonacci(int a, int b, int n, int i) {
         * if (i == n) {
         * return;
         * }
         * int c = a + b;
         * System.out.println(c);
         * fibonacci(b, c, n, i + 1);
         * }
         * 
         */

    }

    public static void n1{

    }


    public static void main(String[] args) {
        // printnumber(5);
        // printnumber2(10);
        // printnumber3(1, 3, 0);
        // System.out.println(calcuatefactorial(5));
        fibonacci(0, 1, 5);
    }
}