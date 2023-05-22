abstract class Geometry {
    abstract double perimeter();
}

class Square extends Geometry {
    private double side;
    
    Square(double side) {
        this.side = side;
    }
    
    double perimeter() {
        return 4 * side;
    }
}

class Circle extends Geometry {
    private double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class  l4_p2 {
    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println("Perimeter of square: " + s.perimeter());
        
        Circle c = new Circle(3);
        System.out.println("Perimeter of circle: " + c.perimeter());
    }
}
