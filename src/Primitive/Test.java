package Primitive;

public class Test {
    public static void main(String[] args) {
        float f = (float) 123.2;

        int a = 123;

        long l = a; //не явное (вообще нет приведения)
        int x = (int) l; //явное приведение типов

        System.out.println(x);

        /**
         * Это конвертирование (приведение) примитивных типов данных.
         * Любое число которое помещается в int соответственно будет помещаться в long.
         */
    }
}
