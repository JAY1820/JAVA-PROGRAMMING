
//pattern 1
//1
//12
//123
//1234
//12345

//pattern 2
//* 
//* *
//* * *
//* * * *
//* * * * *


//use method overloading to print both patterns in same program
//use different number of parameters in both methods




public class l2_p1
 {

    public static void main(String[] args) {
        //pattern 1
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
    //pattern 2
    // int i,j;
    //     for(i=1;i<=5;i++)
    //     {
    //         for(j=1;j<=i;j++)
    //         {
    //             System.out.print("* ");
    //         }
    //         System.out.print("\n");
    //     }



}
