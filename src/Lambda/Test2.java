package Lambda;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("Hello"));
    }

    public static void main(String[] args) {
        int i = 10;
        def((String s) -> {
            System.out.println(i);
            return s.length();
        });
        System.out.println();
    }
}

interface I {
    int abc(String s);
}

