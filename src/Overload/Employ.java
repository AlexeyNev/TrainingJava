package Overload;

public class Employ {

    Employ(int id2, String surname2, int age2) {
        this(id2, surname2, age2, 0.0, null);
    }

    Employ(String surname3, int age3) {
        this(0,"", 3, 0.0, null);
    }

    Employ(int id4, String surname4, int age4, double salary4, String department4) {
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
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
        Employ employ2 = new Employ(25, "Sidorov", 4, 2.3, "eee");
        System.out.println(employ2.department);
    }
}
