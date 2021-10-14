package throwingexceptions.models;

import javax.swing.*;

public class Cat {
    private static long maxId = 1;
    private long id;
    private String name;
    private int age;
    private String color;
    private float weight;
    private Collar collar;

    public Cat(String name, int age, String color, float weight, Collar collar) {
        this.id = Cat.maxId;
        Cat.maxId++;

        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.collar = collar;
    }

    public Cat() {
        this.id = Cat.maxId;
        Cat.maxId++;
    }

    public Cat(Cat other) {
        this.id = Cat.maxId;
        Cat.maxId++;

        this.name = other.name;
        this.age = other.age;
        this.color = other.color;
        this.weight = other.weight;
        this.collar = new Collar(collar);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Collar getCollar() {
        return collar;
    }

    public void setCollar(Collar collar) {
        this.collar = collar;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", collar=" + collar +
                '}';
    }
}
