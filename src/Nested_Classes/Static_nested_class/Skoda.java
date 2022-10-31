package Nested_Classes.Static_nested_class;

public class Skoda {
    String color;
    int door;
    Engine2 engine;

    public Skoda(String color, int door, Engine2 engine) {
        this.color = color;
        this.door = door;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My Skoda car{" +
                "color='" + color + '\'' +
                ", door=" + door +
                ", engine2=" + engine +
                '}';
    }

    static class Engine2 {
        int horsePower;

        public Engine2(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My Skoda car {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test2 {
    public static void main(String[] args) {
        Skoda.Engine2 engine2 = new Skoda.Engine2(69);
        System.out.println(engine2);

        Skoda skoda = new Skoda("Silver", 5, engine2);
        System.out.println(skoda);
    }
}