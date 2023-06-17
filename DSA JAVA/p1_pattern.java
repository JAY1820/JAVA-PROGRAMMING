
// pattern 1
// 1
// 1234
// 12345
// 1234567

// public class p1_pattern {
// public static void main(String[] args) {
// int i,j;
// for(i=1;i<=7;i+=2)
// {
// for(j=1;j<=i;j++)
// {
// System.out.print(j);
// }
// System.out.print("\n");
// }
// }
// }

/*
 *****
 ****
 ***
 **
 *
 * 
 * public class p1_pattern {
 * public static void main(String[] args) {
 * int i,j;
 * for(i=5;i>=1;i--)
 * {
 * for(j=5;j>=i;j--)
 * {
 * System.out.print(" ");
 * }
 * for(j=1;j<=i;j++)
 * {
 * System.out.print("*");
 * }
 * System.out.print("\n");
 * }
 * }
 * }
 * 
 */
/*
 * pattern 3
 * *
 * *
 *
 * *
 * *
 * public class p1_pattern {
 * public static void main(String[] args) {
 * int i,j;
 * for(i=1;i<=5;i++)
 * {
 * for(j=1;j<=5;j++)
 * {
 * if(i==j || i+j==6)
 * {
 * System.out.print("*");
 * }
 * else
 * {
 * System.out.print(" ");
 * }
 * }
 * System.out.print("\n");
 * }
 * }
 * }
 * 
 */

/*
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 
 * public class p1_pattern {
 * public static void main(String[] args) {
 * int i,j,k=1;
 * for(i=1;i<=4;i++)
 * {
 * for(j=1;j<=i;j++)
 * {
 * System.out.print(k+" ");
 * k++;
 * }
 * System.out.print("\n");
 * }
 * }
 * }
 * 
 */

/*
 * 1 0 1 0 1
 * 0 1 0 1 0
 * 1 0 1 0 1
 * 0 1 0 1 0
 * 
 * public class p1_pattern {
 * public static void main(String[] args) {
 * int i,j;
 * for(i=1;i<=5;i++)
 * {
 * for(j=1;j<=5;j++)
 * {
 * if((i+j)%2==0)
 * {
 * System.out.print("1 ");
 * }
 * else
 * {
 * System.out.print("0 ");
 * }
 * }
 * System.out.println("\n");
 * }
 * }
 * }
 * 
 */

/*
 * 1 2 3 4 5
 * 1 2 3 4
 * 1 2 3
 * 1 2
 * 1
 * 
 * public class p1_pattern {
 * public static void main(String[] args) {
 * int i,j;
 * for(i=5;i>=1;i--)
 * {
 * for(j=1;j<=i;j++)
 * {
 * System.out.print(j+" ");
 * }
 * System.out.println("\n");
 * }
 * }
 * }
 */

/*
 * A
 * B B
 * C C C
 * D D D D
 * E E E E E
 * 
 
 public class p1_pattern {
     public static void main(String[] args) {
         int i,j;
         for(i=1;i<=5;i++)
         {
             for(j=1;j<=i;j++)
             {
                 System.out.print((char)(i+64)+" ");
                }
                System.out.println("\n");
            }
        }
    }
    */

/*
   A

  B B

 C   C

D     D

 C   C

  B B

   A  
 */

 public class p1_pattern   {
    public static void main(String[] args) {
        int size = 4;

        // Print upper half of the pattern
        for (int i = 0; i < size; i++) {
            // Print spaces
            for (int j = size - 1; j > i; j--) {
                System.out.print(" ");
            }

            // Print letters
            System.out.print((char) ('A' + i));

            // Print inner spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            // Print letters again
            if (i != 0) {
                System.out.print((char) ('A' + i));
            }

            System.out.println();
        }

        // Print lower half of the pattern
        for (int i = size - 2; i >= 0; i--) {
            // Print spaces
            for (int j = size - 1; j > i; j--) {
                System.out.print(" ");
            }

            // Print letters
            System.out.print((char) ('A' + i));

            // Print inner spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            
            // Print letters again
            if (i != 0) {
                System.out.print((char) ('A' + i));
            }

            System.out.println()
        }
    }
}
