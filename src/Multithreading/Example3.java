package Multithreading;

public class Example3 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Example3());
        thread.start();

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }
}
