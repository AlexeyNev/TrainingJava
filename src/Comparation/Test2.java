package Comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee employee1 = new Employee(100, "Marsic", "Marsicov", 15000);
        Employee employee2 = new Employee(10, "Alla", "Gorbatovskaya", 20000);
        Employee employee3 = new Employee(123, "Alexey", "Nevredimov", 25000);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        System.out.println("Before sorting \n" + list);
        Collections.sort(list);
        System.out.println("After sorting list \n" + list);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmployee) {
        if (this.id == anotherEmployee.id) {
            return 0;
        } else if (this.id < anotherEmployee.id) {
            return -1;
        } else {
            return 1;
        }
////     либо   int res =  this.name.compareTo(anotherEmployee.name);
////        if (res == 0) {
////            res = this.surname.compareTo(anotherEmployee.surname);
////        }
////        return res;
//    }
//    // либо return this.id - anotherEmployee.id
//}

//    static class IdComparator implements Comparator<Employee> {
//        @Override
//        public int compare(Employee employee1, Employee employee2) {
//            if (employee1.id == employee2.id) {
//                return 0;
//            } else if (employee1.id < employee2.id) {
//                return -1;
//            } else {
//                return 1;
//            }
//        }
//    }

        class NameComparator implements Comparator<Employee> {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.name.compareTo(employee2.name);
            }
        }

        class SalaryComparator implements Comparator<Employee> {
            @Override
            public int compare(Employee employee1, Employee employee2) {

                return employee1.salary - employee2.salary;
            }
        }
    }}