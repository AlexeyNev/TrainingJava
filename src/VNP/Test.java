package VNP;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting - восходящее преобразование, тк dog стоит ниже класса animal
        Dog dog = new Dog();

        Animal animal1 = dog;

        Dog dog1 = (Dog) animal1; // Downcasting - нисходящее преобразование
        dog1.bark();
    }
}
