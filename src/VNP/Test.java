package VNP;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog dog = (Dog) a;
        dog.bark();

        /**
         * Восходящее преобразование безопасно, а нисходящее наоборот.
         */
    }
}
