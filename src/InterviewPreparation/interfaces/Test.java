package InterviewPreparation.interfaces;

import InterviewPreparation.interfaces.Animal;
import InterviewPreparation.interfaces.Person;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person = new Person("Petr");
        animal.sayHello();
        person.sayHello();
    }
}
