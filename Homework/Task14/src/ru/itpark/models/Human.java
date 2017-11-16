package ru.itpark.models;

public class Human {
    private int id;
    private String name;
    private int age;
    private String citizen;

    public Human(int id, String name, int age, String citizen) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.citizen = citizen;
    }

    public Human(String name, int age, String citizen) {
        this.name = name;
        this.age = age;
        this.citizen = citizen;
    }
    public Human(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCitizen() {
        return citizen;
    }

    public void setCitizen(String citizen) {
        this.citizen = citizen;
    }

    @Override
    public String toString() {
        return this.id + " "+ this.name + " "
                + this.age + " " + this.citizen;
    }
}
