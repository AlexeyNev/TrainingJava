package Nested_Classes.Anonimous_class;

public class AnonimousClass {
    public static void main(String[] args) {
        Math m = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };

        Math m2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };

        Minus minus = new Minus() {
            @Override
            public int doMinus(int a, int b) {
                return a - b;
            }
        };
        System.out.println(m.doOperation(2, 2));
        System.out.println(m2.doOperation(4, 2));
        System.out.println(minus.doMinus(2, 2));
    }
}

interface Math {
    int doOperation(int a, int b);
}

class Minus {
    int doMinus(int a, int b) {
        return a - b;
    }
}