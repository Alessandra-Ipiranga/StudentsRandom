package de.neuefische.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    @DisplayName("Name cannot be empty!")
    public void nameTest() {
        //GIVEN
        String name = "";
        //WHEN
        Student student = new Student();
        student.setName(name);
        String actual = student.getName();
        //THEN
        assertEquals(name, actual);
    }

    @Test
    @DisplayName("Check if id can be set and get")
    public void idTest() {
        //GIVEN
        int id = -42;
        //WHEN
        Student student = new Student();
        student.setId(id);
        int actual = student.getId();
        //THEN
        assertEquals(id, actual);
    }

    @Test
    @DisplayName("Check if methode returns students array")
    public void listTest() {
        //GIVEN
        Student student1 = new Student("Peter", 123);
        Student student2 = new Student("Paul", 456);

        Student[] students = {
                student1,
                student2
        };

        //WHEN
        StudentDB studentDB = new StudentDB(students);
        Student[] actual = studentDB.list();

        //THEN
        assertEquals(students, actual);
    }

    @Test
    @DisplayName("Check if methode returns students array")
    public void toStringTest() {
        //GIVEN
        Student student1 = new Student("Peter", 123);
        Student student2 = new Student("Paul", 456);
        Student[] students = {
                student1,
                student2
        };
        String expected = "Name: Peter, id: 123\nName: Paul, id: 456\n";
        //WHEN
        StudentDB studentDB = new StudentDB(students);
        String actual = studentDB.toString();
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Students with the same name are equal")
    public void studentsAreEqualTest() {
        //GIVEN
        Student student = new Student("Jonas", 24);
        Student student1 = new Student("Jonas", 24);
        //WHEN
        boolean actual = student.equals(student1);
        //THEN
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Students with different name are not equal")
    public void studentsAreDefferentTest() {
        //GIVEN
        Student student = new Student("Jonas", 24);
        Student student1 = new Student("Peter", 24);
        //WHEN
        boolean actual = student.equals(student1);
        //THEN
        assertFalse(actual);
    }

    @Test
    @DisplayName("Student Array add method")
    public void testAddStudent(){
        //GIVEN
        Student student = new Student("Jonas", 24);
        Student student1 = new Student("Peter", 25);
        Student[] studentArray = {student , student1};
        StudentDB studentDB = new StudentDB(studentArray);
        Student student2 = new Student("Bob", 26);
        Student[] expectedArray = {student,student1,student2};
        //WHEN
        Student[] actualArray = studentDB.add(student2);
        //THEN
        assertArrayEquals(expectedArray,actualArray);
    }
}