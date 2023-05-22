
//pattern 1
//1
//123
//12345
//1234567


public class p1_pattern {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=7;i+=2)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}

