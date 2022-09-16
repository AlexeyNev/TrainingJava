package Overload;

public class Overloading2 {
    int sum(int i1, int i2) {
        return i1 + i2;
    }

    String sum(String s1, String s2) {
        return s1 + s2;
    }
}

class OverloadTest {
    public static void main(String[] args) {
        Overloading2 overload = new Overloading2();
        int a = overload.sum(4, 2);
        System.out.println(a);
        String b = overload.sum("He", "llo");
        System.out.println(b);
    }
}
