interface Demo {
    void show();
}

class A implements Demo {
    public void show() {
        System.out.println("I am in A");
    }
}
class B extends A {
    public void show() {
        System.out.println("I am in B");
    }
}
class C extends B {
    public void show() {
        System.out.println("I am in C");
    }
}
public class l5_p2
 {    
public static void main(String[] args) {
    Demo obj1 = new A();
    obj1.show(); // Output: I am in A

    Demo obj2 = new B();
    obj2.show(); // Output: I am in B

    Demo obj3 = new C();
    obj3.show(); // Output: I am in C
}
    
}
