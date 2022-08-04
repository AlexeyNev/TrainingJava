package AnonymousClasses;

public class Test {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("is eating");
            }
        };
        ableToEat.eat();
    }
}
