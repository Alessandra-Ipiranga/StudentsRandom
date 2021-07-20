package de.neuefische.model;

import java.util.Objects;

public class Student {

    private int age = 24;
    private String name = "Peter";
    private String matricultionNumber = "212727";

    public Student() {

    }

    public Student(String name, int age, String matriculationNumb) {
        this.name = name;
        this.age = age;
        this.matricultionNumber = matriculationNumb;
    }

    public void setMatricutionNumber(String matricultionNumber) {
        this.matricultionNumber = matricultionNumber;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        return this.age = age;
    }

    public String getMatriculationNumber() {
        return matricultionNumber;
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
                "age=" + getAge() +
                ", name='" + getName() + '\'' +
                ", matricultionNumber='" + getMatriculationNumber() + '\'' +
                '}';
    }

}
