package com.company;

import java.util.Objects;


public class Employer extends JobField {

    public Employer(String value) {
        super(value);
    }


}

//public class Employer {
//    private static int nextId = 1;
//
//    private final int id;
//    private String value;
//
//    public Employer() {
//        id = nextId;
//        nextId++;
//    }
//
//    public Employer(String value) {
//        this();
//        this.value = value;
//    }
//
//    // Custom toString, equals, and hashCode methods:
//
//    @Override
//    public String toString() {
//        return this.value;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employer employer = (Employer) o;
//        return id == employer.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
//
//    // Getters and Setters:
//
//    public int getId() { return this.id; }
//
//    public String getValue() { return this.value; }
//
//    public void setValue(String value) { this.value = value; }
//
//}
