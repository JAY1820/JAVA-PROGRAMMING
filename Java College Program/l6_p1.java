/* 
 Write a Java program using reflection API to get the following details of any class.
a) Class Metadata
i) Name of the class.
ii) Super class reference
iii) List of interfaces implemented by the specified class
iv) Class Modifiers
b) Fields Metadata
i) Variable name
ii) Data types of the variable
iii) Access modifiers of the variable
c) Methods Metadata
i) Method name
ii) Return types of the method
iii) Access modifiers of the method
iv) List of parameter types of the method
v) List of exceptions thrown by method
d) Constructors Metadata
i) Constructor's name
ii) Access modifiers of the constructor
iii) List of parameter types of the constructor
iv) List of exceptions thrown by constructor
*/
import java.lang.reflect.*;

class Hello {
    public int i;
    public float b;

    Hello() {
        System.out.println("Hello");
    }

    Hello(int i) {
        this.i = i;
    }

    public void bye(int i) {
        System.out.println("bye");
    }

    public void ok() {
        System.out.println("bye");
    }
}

class Main {
    public static void main(String[] args) {
        Hello h = new Hello();
        Class c = h.getClass();

        // Class Metadata
        System.out.println("Class Metadata:");

        System.out.println("Name: " + c.getName());
        System.out.println("Superclass: " + c.getSuperclass());
        System.out.println("Implemented Interfaces: ");
        Class[] interfaces = c.getInterfaces();
        for (Class iface : interfaces) {
            System.out.println(iface);
        }
        System.out.println("Modifiers: " + Modifier.toString(c.getModifiers()));

        System.out.println();

        // Fields Metadata
        System.out.println("Fields Metadata:");
        Field[] fields = c.getDeclaredFields();
        for (Field f : fields) {
            System.out.println("Variable Name: " + f.getName());
            System.out.println("Data Type: " + f.getType().getName());
            System.out.println("Modifiers: " + Modifier.toString(f.getModifiers()));
            System.out.println();
        }

        // Methods Metadata
        System.out.println("Methods Metadata:");
        Method[] methods = c.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method Name: " + m.getName());
            System.out.println("Return Type: " + m.getReturnType().getName());
            System.out.println("Modifiers: " + Modifier.toString(m.getModifiers()));
            System.out.println("Parameter Types: ");
            Class[] parameterTypes = m.getParameterTypes();
            for (Class paramType : parameterTypes) {
                System.out.println(paramType.getName());
            }
            System.out.println();
        }

        // Constructors Metadata
        System.out.println("Constructors Metadata:");
        Constructor[] constructors = c.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("Constructor Name: " + constructor.getName());
            System.out.println("Modifiers: " + Modifier.toString(constructor.getModifiers()));
            System.out.println("Parameter Types: ");
            Class[] parameterTypes = constructor.getParameterTypes();
            for (Class paramType : parameterTypes) {
                System.out.println(paramType.getName());
            }
            System.out.println();
        }
    }
}
