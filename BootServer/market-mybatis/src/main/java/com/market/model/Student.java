package com.market.model;

public class Student {
    private int id;
    private String name;
    private int age;
    private int inYear;
    private double tall;

    public int getId() {
        return id;
    }

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public int getInYear() {
        return inYear;
    }

    public Student setInYear(int inYear) {
        this.inYear = inYear;
        return this;
    }

    public double getTall() {
        return tall;
    }

    public Student setTall(double tall) {
        this.tall = tall;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", inYear=" + inYear +
                ", tall=" + tall +
                '}';
    }
}
