package AnonymousClasses;

public class Test {
    public static void main(String[] args) {

        /**
         * Переопределение метода с помощью анонимного класса
         */
        Animal animal1 = new Animal() {
          public void eat() {
              System.out.println("Other animal is eating");
          }
        };
    }
}
