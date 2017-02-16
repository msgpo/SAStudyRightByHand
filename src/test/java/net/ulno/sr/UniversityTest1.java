package net.ulno.sr;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ulno on 2/16/17.
 */
public class UniversityTest1 {
    @Test
    public void testKarliInUniversity() throws Exception {
        University u = new University();

        Student karli = new Student();
        karli.setName("Karli");
        u.addStudent(karli);

        assertTrue(u.getStudents().contains(karli));
    }




}