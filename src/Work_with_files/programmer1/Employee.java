package Work_with_files.programmer1;

import java.io.Serializable;

/**
 * transient double salary;
 * ключевое слово transient скрывает данные поля double salary;
 */

public class Employee implements Serializable {
        static final long serialVersionUID = 1;
        String name;
        String surname;
        String department;
        transient double salary;
        Car car;


    public Employee(String name, String surname, String department, double salary, Car car) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
