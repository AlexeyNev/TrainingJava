package Overload;

public class Test10 {
    int sum(int a, int b, int c) {
        return a + b + c;
    }

    int sredArfm(int a1, int b1, int c1) {
        return sum(a1, b1, c1)/ 3;
    }
}
