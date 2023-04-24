import java.util.Scanner;

class ArithmeticIntOp {
    int result;

    ArithmeticIntOp() {
        result = 0;
    }

    int getArithmethicIntOpResult() {

        return result;
    }

    void calculate(int a, int b, char op) {

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '%':
                result = a % b;
                break;
            default:
                System.out.println("Please Enter Right Arithmentic Op");
        }
    }
}

class RelationalOp {
    boolean result;

    RelationalOp() {
        result = false;
    }

    boolean RelationalOpResult() {

        return result;
    }

    void calculate(int a, int b, String op) {

        switch (op) {
            case "==":
                result = a == b;
                break;
            case "<=":
                result = a <= b;
                break;
            case ">=":
                result = a >= b;
                break;
            case "<":
                result = a < b;
                break;
            case ">":
                result = a > b;
                break;
            case "!=":
                result = a != b;
                break;

            default:
                System.out.println("Please Enter Right Relational Op");
        }
    }
}

class BitwiseOp {
    int result;

    BitwiseOp() {
        result = 0;
    }

    int BitwiseOpResult() {

        return result;
    }

    void calculate(int a, int b, String op) {

        switch (op) {
            case ">>>":
                result = a >>> b;
                break;
            case ">>":
                result = a >> b;
                break;
            case "<<":
                result = a << b;
                break;
            case "&":
                result = a & b;
                break;
            case "^":
                result = a ^ b;
                break;
            case "|":
                result = a | b;
                break;

            default:
                System.out.println("Please Enter Right Relational Op");
        }
    }
}

class l3p1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A :");
        int a = sc.nextInt();

        System.out.println("Enter B :");
        int b = sc.nextInt();
        System.out.println("1) Arithmetihc op");
        System.out.println("2) Relational op");
        System.out.println("3) Bitwise op");
        System.out.println("4) Exit");

        System.out.println("Enter Your choice :");
        int c = sc.nextInt();

        switch (c) {
            case 1:
                ArithmeticIntOp Aop = new ArithmeticIntOp();
                System.out.println("Enter Oparation (+,-,*,/,%):");
                char op = sc.next().charAt(0);
                Aop.calculate(a, b, op);
                System.out.println(a + " " + op + " " + b + " = " + Aop.getArithmethicIntOpResult());
                break;


                
            case 2:
                RelationalOp Rop = new RelationalOp();
                System.out.println("Enter Oparation (==,>,<,>=,<=,!=):");
                String rop = sc.next();
                Rop.calculate(a, b, rop);
                System.out.println(a + " " + rop + " " + b + " = " + Rop.RelationalOpResult());
                break;
                
            case 3:
                BitwiseOp bop = new BitwiseOp();
                System.out.println("Enter Oparation (==,>,<,>=,<=,!=):");
                String bop1 = sc.nextLine();
                bop.calculate(a, b, bop1);
                System.out.println(a + " " + bop1 + " " + b + " = " + bop.BitwiseOpResult());
                break;
            default:
                System.out.println("Pleaseenter Right choce");

        }

    }
}