public class p17_recursion {

    //calcaute X^n using recursion (stack height = n)

    public static int power(int x, int n) {
       if(n==0){
           return 1;
         }
         if(x==0){
             return 0;
         }

        int ans = power(x, n-1);
        int myans = x*ans;
        return myans;
    }
//height is log(n)
    public static int power1(int x, int n) {
        if (n == 0) {
            return 1;
        }
        //if n is even
        if(n%2==0){
            return power(x,n/2)*power(x,n/2);
        }
        else{
            return power(x,n/2)*power(x,n/2)*x;
        }
    }
    public static void main(String[] args) {
        // System.out.println(power(2, 3)); 
        System.out.println(power1(2, 4));
    }
    
}
