package Polymorf;

public class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is bark");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}
