package test.lessons.encapsulation;

public class TestUncaps {
    public static void main(String[] args) {
        Person person = new Person("Sena", 8);
        System.out.println(person);

        Person person1 = new Person();
        person.setName("");
        person.getName();
        System.out.println(person);
        System.out.println(person1);
        System.out.println("--------------");
        person1.setName("Sasha");
        person1.setAge(8);
        person.setAge(0);
        person.setName("");
        System.out.println(person1.toString());
        System.out.println(person);
    }


}

class Person {
    private String name;
    private int age;

    public Person() {
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Ты ввел пустое имея");
        } // если сторока пустая, то выводим сообщение. Возможность обрабатывать методами

        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age == 0) {
            System.out.println("Не корректный возвраст");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }


    @Override       // переопределенный toString
    public String toString() {
        return "Имя человека: " +
                name + ", возвраст: " + age;
    }
}
