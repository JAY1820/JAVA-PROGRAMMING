public class p2 {
    
    //binary to decimal
    public static int binaryToDecimal(int n) {
        int sum = 0;
        int i = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * Math.pow(2, i);
            n /= 10;
            i++;
        }
        return sum;
    }

    //main 
    public static void main(String[] args) {
        
        binaryToDecimal(1010);

    }
}
