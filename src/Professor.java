/*It is possible to implement constructors, setter, getters or any other additional method
        where it is considered necessary.
        1. Declare a class Professor with the following instance variables:
        - name: String
        - identifier: long
        - course: String
        2. Implement a method printCourseLastLetter that takes an array of Professor objects
        as parameter and prints to the terminal the last letter of the course string of each
        element of the array.
        3. Implement a main method where:
        - An array of 3 Professor objects is allocated.
        - The method printCourseLastLetter is called, passing the allocated array as
        parameter.
        - The value of the name attribute for each element of the array is printed to
        screen, if for that specific element the length of the course attribute is > 10.*/

public class Professor {
    private String name;
    private long identifier;
    private String course;

    public Professor(String name, long identifier, String course) {
        this.name = name;
        this.identifier = identifier;
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }
}

