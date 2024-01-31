package testModel;

import java.util.Objects;

public class Demo {
    private String name;
    private int age;

    // following are the getters and setters

    // if you need to return, then you put a type
    public String getName() {
        return name;
    }

    // if you don't need to return, then you put void
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo demo = (Demo) o;
        return age == demo.age && Objects.equals(name, demo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //method is below since public doesn't have a type afterwards
    public Demo(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// so when you see @override it means your method is coming from a super class (aka parent class)
