package Training;

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("inf");
        } else {
            System.out.println(a != 0 ? "1" : "0");
        }

        sc.close();
    }
}