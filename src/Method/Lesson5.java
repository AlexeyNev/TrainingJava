package Method;

public class Lesson5 {
    int summa(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    int srevdnee(int a, int b, int c) {
        return summa(a, b, c) / 3;
    }
}

class Test {
    public static void main(String[] args) {
        Lesson5 t = new Lesson5();

        System.out.println(t.srevdnee(2, 2, 2));
    }
}
