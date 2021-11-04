package com.company;

public class Dog {
    String name;
    int age;
    public Dog(String name, int age){
    this.name = name;
    this.age = age;
    }
    public Dog( int age){
        this.name = "nameless";
        this.age = age;
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
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age + " years" +
                '}';
    }
}
