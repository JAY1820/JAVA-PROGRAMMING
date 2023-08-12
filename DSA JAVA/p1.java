public class p1 {

    // sum of digits
    public static void sum(int n) {

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }

    // palindrome number
    public static void palindrome() {
        int n = 121;
        int temp, rev;
        temp = n;
        rev = 0;
        for (int i = 0; i < 3; i++) {
            rev = rev * 10;
            rev = rev + n % 10;
            n = n / 10;
        }
        if (temp == rev) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    // armstrong number
    public static void armstrong() {
        int n = 153;
        int temp, sum;
        temp = n;
        sum = 0;
        for (int i = 0; i < 3; i++) {
            // sum = sum + (n % 10) * (n % 10) * (n % 10);
            sum = sum + (int) Math.pow(n % 10, 3);
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }

    // fibonacci series using recursion
    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    // find nth term of fibonacci series
    public static int fact(int n) {
        if (n == 0)
            return 1;
        return n * fact(n - 1);
    }

    // power of a number
    public static int power(int n, int p) {
        if (p == 0)
            return 1;
        return n * power(n, p - 1);
    }

    public static void factor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void strong(int n) {
        int temp = n;
        int sum = 0;
        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++) {
            int digit = Character.getNumericValue(s.charAt(i));
            sum += fact(digit);
        }
        if (sum == temp) {
            System.out.println("strong");
        } else {
            System.out.println("not strong");
        }
    }

    //
    public static void automorphic(int n) {
        int sq = n * n;
        int result = sq % 10;
        if (result == n) {
            System.out.println("automorphic");
        } else {
            System.out.println("not automorphic");
        }
    }

    //
    public static void harshad(int n) {

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
        int result = sum;
        if (n % result == 0) {
            System.out.println("harshad");
        } else {
            System.out.println("not harshad");
        }
    }

    public static void main(String[] args) {
        sum(2020);
        palindrome();
        armstrong();
        System.out.println(fib(5));
        System.out.println(fact(5));
        System.out.println(power(2, 3));
        factor(10);
        strong(145);
        automorphic(25);
        harshad(21);

    }
}
