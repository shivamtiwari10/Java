package oop_advanced;


public class StudentNotFoundException extends Exception {

    public StudentNotFoundException() {
        super("Student not found!");
    }
}