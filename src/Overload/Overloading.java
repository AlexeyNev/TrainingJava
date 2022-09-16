package Overload;

public class Overloading {
    void show(int i1) {
        System.out.println(i1);
    }

    void show(boolean b1) {
        System.out.println(b1);
    }
    void show(String s1) {
        System.out.println(s1);
    }
    void show(String s, int a) {
        System.out.println("String :" + s + "int :" + a);
    }
    void show(int s, String a) {
        System.out.println("Good day");
    }
}

class OverTest {
    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        int a = 500;
        overloading.show(a);
        boolean b = true;
        overloading.show(b);
        String s = "Hello";
        overloading.show(s);
        overloading.show("Yo", 1);
    }
}