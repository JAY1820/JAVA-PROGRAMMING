//jdbc mysql connection
import java.sql.*;
import java.util.Scanner;

public class l10_p1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice for claculate: 1)area of circle 2)area of traingle 3)area of rectangle");
        int c = sc.nextInt();

        switch (c) {

            case 1:
                System.out.println("enter a radius of circle ");
                int r1 = sc.nextInt();
                circle c1 = new circle(r1);
                c1.circlearea();
                System.out.printf("%.2f", c1.circlearea());
                break;

            case 2:
                System.out.println("enter a base and height of triangle ");
                int b1 = sc.nextInt();
                int h1 = sc.nextInt();
                triangle t1 = new triangle(b1, h1);
                t1.trianglearea();
                System.out.printf("%.2f", t1.trianglearea());
                break;

            case 3:
                System.out.println("enter a length and breadth of rectangle ");
                int l1 = sc.nextInt();
                int b2 = sc.nextInt();
                rectangle r1 = new rectangle(l1, b2);
                r1.rectanglearea();
                System.out.printf("%.2f", r1.rectanglearea());
                break;

            default:
                System.out.println("Please Enter Right Choice");
        }

    }
}