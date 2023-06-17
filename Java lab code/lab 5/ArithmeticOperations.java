package lab5;

import lab5.l5p4.Arithmetic;

public class ArithmeticOperations implements Arithmetic {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public float division(float num1, float num2) {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return num1 / num2;
    }

    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }
}
