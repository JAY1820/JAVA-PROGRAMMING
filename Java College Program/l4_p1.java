class Animal {
    void eat() {
        System.out.println("The animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking");
    }
}

public class l4_p1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat(); // inherited from Animal class
        d.bark();
    }
}


