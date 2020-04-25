package test.lessons.constructor;

public class Lesson20 {
    public static void main(String[] args) {
        Human human1 = new Human("Vasily");
        Human human2 = new Human("Bob");
        Human human3 = new Human(8);
        Human human4 = new Human();
        System.out.println("----------------");
        human1.setAge(19);
        System.out.println(human1);
        System.out.println("----------------");
        System.out.println(human1.getAge());
        System.out.println(human2);
        System.out.println("----------------");
        System.out.println(human3);
        System.out.println(human4);
        System.out.println("----------------");


    }
}

class Human {
    private String name;
    private int age;

    public Human() {
        System.out.println("Default constructor");
    }

    public Human(int age) {
        this.age = age;
    }

    public Human(String name) {
        this.name = name;
    }

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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}