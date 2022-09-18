package Overload;

public class Employ {

    Employ(int id1, String surname1, int age1) {
        id = id1;
        surname = surname1;
        age = age1;
    }

    Employ(String surname1, int age1) {
        surname = surname1;
        age = age1;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;
}

class EmployTest {
    public static void main(String[] args) {
        Employ employ = new Employ(1, "Petrov", 19);
        System.out.println(employ.age);
        Employ employ1 = new Employ("Katkov", 21);
        System.out.println(employ1.surname);
    }
}
