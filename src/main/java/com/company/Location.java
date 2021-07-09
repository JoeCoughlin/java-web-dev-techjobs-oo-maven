package com.company;

public class Location extends JobField{

    public Location() {
    }

    public Location(String value) {
        super(value);
    }

}
//public class Location {
//    private static int nextId = 1;
//
//    private int id;
//    private String value;
//
//    public Location() {
//        id = nextId;
//        nextId++;
//    }
//
//    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The constructors should also call the empty constructor in order to initialize the 'id' field.
//
//    public Location(String value) {
//        this();
//        this.value = value;
//    }
//
//    // Custom toString, equals, and hashCode methods:
//
//    @Override
//    public String toString() { return this.value; }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Location location = (Location) o;
//        return id == location.id;
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
//}
