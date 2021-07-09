package com.company.incomplete;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.company.*;

public class JobTests {
    static Job test1, test2, test3, test4, test5;

    @BeforeAll
    static void createJobObject() {
        test1 = new Job();
        test2 = new Job();
        test3 = new Job("Mild-Mannered Reporter",
                new Employer("Daily Planet"),
                new Location("Metropolis"),
                new PositionType("Political Reporter"),
                new CoreCompetency("Flight"));
        test4 = new Job("Mild-Mannered Reporter",
                new Employer("Daily Planet"),
                new Location("Metropolis"),
                new PositionType(""),
                new CoreCompetency("Flight"));
        test5 = new Job("",
                new Employer(""),
                new Location(""),
                new PositionType(""),
                new CoreCompetency(""));

    }

    @Test
    void testSettingJobId () {
        Integer id1 = test1.getId();
        Integer id2 = test2.getId();
        assertEquals(1, id2-id1);
    }

    @Test
    void testJobConstructorSetAllFields () {
        assertTrue(test3.getName() instanceof String);
        assertTrue(test3.getEmployer() instanceof Employer);
        assertTrue(test3.getLocation() instanceof Location);
        assertTrue(test3.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(test3.getPositionType() instanceof PositionType);
    }

    @Test
    void testJobsForEquality () {
        assertNotEquals(test3, test4);
    }

    @Test
    void testToStringEmpty () {
        assertTrue(test5.toString().startsWith("\n"));
    }

    @Test
    void testToStringEmpty1 () {
        assertTrue(test5.toString().endsWith("\n"));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        char firstChar = test4.toString().charAt(0);
        char lastChar = test4.toString().charAt(test4.toString().length() - 1);
        assertTrue(firstChar == lastChar);
    }

    @Test
    void  testToStringContainsBlankLines() {
        assertTrue(test1.toString().startsWith("\n"));
        assertTrue(test1.toString().endsWith("\n"));

    }

    @Test
    public void testToStringContainsCorrectLabels() {
        String output = String.format("\nID: %d\n" +
                        "Name: %s\n" +
                        "Employer: %s\n" +
                        "Location: %s\n" +
                        "Position Type: %s\n" +
                        "Core Competency: %s\n", test3.getId(), test3.getName(), test3.getEmployer(), test3.getLocation(),
                test3.getPositionType(), test3.getCoreCompetency());
        String actual = test3.toString();
        assertEquals(output, test3.toString());
    }

    @Test
    public void testForDataNotAvailable() {
        String expected = String.format("\nID: %d\n" +
                        "Name: %s\n" +
                        "Employer: %s\n" +
                        "Location: %s\n" +
                        "Position Type: %s\n" +
                        "Core Competency: %s\n",test4.getId(), test4.getName(), test4.getEmployer(), test4.getLocation(),
                test4.getPositionType(), test4.getCoreCompetency());
        String actual = test4.toString();
        assertEquals(expected, actual);
    }



}