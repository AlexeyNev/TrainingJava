package HashTable;

import HashMapTest.HashCodeEx;

import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Double, HashCodeEx.Student> hashtable = new Hashtable<>();
        HashCodeEx.Student st1 = new HashCodeEx.Student("Ivan", "Petrov", 3);
        HashCodeEx.Student st2 = new HashCodeEx.Student("Nikolay", "Sidorov", 2);
        HashCodeEx.Student st3 = new HashCodeEx.Student("Elena", "Katkova", 1);
        HashCodeEx.Student st4 = new HashCodeEx.Student("Evgeniy", "Katkov", 1);

        hashtable.put(7.4, st1);
        hashtable.put(8.5, st2);
        hashtable.put(9.7, st3);
        hashtable.put(5.5, st4);

        System.out.println(hashtable);
    }
}
