package InterviewPreparation.interfaces;

public class Person implements Info {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {

    }

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}
