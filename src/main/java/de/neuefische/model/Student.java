package de.neuefische.model;

import java.util.Objects;

public class Student {

    private int id = 24;
    private String name = "Peter";


    public Student() {

    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public int setId(int id) {
        return this.id = id;
    }



    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                '}';
    }


}
