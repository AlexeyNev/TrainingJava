package Training;

import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = 0;

        c = (a * a) + (b * b);
        System.out.println(Math. sqrt(c));

        sc.close();
    }
}