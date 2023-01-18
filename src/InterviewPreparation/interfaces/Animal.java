package InterviewPreparation.interfaces;

public class Animal implements Info {
    public int id;
    public Animal(int id) {
        this.id = id;
    }

    @Override
    public void showInfo() {

    }

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}
