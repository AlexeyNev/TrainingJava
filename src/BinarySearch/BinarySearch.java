package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);

//        int index = Collections.binarySearch(arrayList, 12);
//        System.out.println(index);
//        /**
//         * Если индекс позиции найден не будет - то выведется отрицательное число
//         */

//        Employee employee1 = new Employee(100, "Alexey", 4563);
//        Employee employee2 = new Employee(15, "Alla", 7699);
//        Employee employee3 = new Employee(123, "Mars", 456666);
//        Employee employee4 = new Employee(15, "Petr", 977970);
//        Employee employee5 = new Employee(182, "Fedor", 000077);
//        Employee employee6 = new Employee(15, "Murka", 343221);
//        Employee employee7 = new Employee(250, "Druzhok", 22);
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(employee1);
//        employeeList.add(employee2);
//        employeeList.add(employee3);
//        employeeList.add(employee4);
//        employeeList.add(employee5);
//        employeeList.add(employee6);
//        employeeList.add(employee7);
//        System.out.println(employeeList);
//        Collections.sort(employeeList);
//        System.out.println(employeeList);
//        int index2 = Collections.binarySearch(employeeList,
//                new Employee(123, "Mars", 456666));
//        System.out.println(index2);

//        int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        int index1 = Arrays.binarySearch(array, 150);
//        System.out.println(index1);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0) {
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}