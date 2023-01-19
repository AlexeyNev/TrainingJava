package InterviewPreparation.statics;

public class Lesson {
    public static void main(String[] args) {
        Human human = new Human("Bob", 30);
        Human human1 = new Human("Tom", 30);
        human.desc = "Nice";
        human.getAllField();
        human1.getAllField();
        human.desc = "No nice";
        human.getAllField();
        human1.getAllField();
    }
}

class Human {
    private String name;
    private int age;
    public static String desc;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getAllField() {
        System.out.println(name + ", " + age + ", " + desc);
    }

    public static void printAllFields() {
        System.out.println(desc);
    }
}


