import java.util.Scanner;

class circle {
    double area;

    circle(int r) {

        area = Math.PI * r * r;
    }

    double circlearea() {

        return area;
    }
}

class triangle {
    double area;

    triangle(int b, int h) {
        area = 0.5 * b * h;
    }

    double trianglearea() {

        return area;
    }
}

class rectangle {
    double area;

    rectangle(int l, int b) {
        area = l * b;
    }

    double rectanglearea() {
        return area;
    }

}

public class l3p2 {

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
                System.out.println("enter a triangle height and base ");
                int b1 = sc.nextInt();
                int h1 = sc.nextInt();

                triangle t1 = new triangle(b1, h1);
                t1.trianglearea();
                System.out.printf("%.2f", t1.trianglearea());
                break;

                
            case 3:
                System.out.println("enter a rectangle length and width ");
                int l1 = sc.nextInt();
                int w1 = sc.nextInt();

                rectangle ra1 = new rectangle(l1, w1);
                ra1.rectanglearea();
                System.out.printf("%.2f", ra1.rectanglearea());
                break;

            default:
                System.out.println("Pleaseenter Right choce");

        }

    }
}
