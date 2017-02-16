package net.ulno.sr;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ulno on 2/16/17.
 */


public class UniversityTest1 {

    University uni;
    Student karli;
    Course mathCourse, calculusCourse;
    LectureHall mathLectureHall, calcLectureHall;

    @Test
    public void testKarliInUniversity() throws Exception {
        University u = new University();

        Student karli = new Student();
        karli.setName("Karli");
        u.addStudent(karli);

        assertTrue(u.getStudents().contains(karli));
    }
    private void preCondition(){
        uni = new University();
        karli = new Student();

        mathCourse = new Course();
        calculusCourse = new Course();
        mathLectureHall = new LectureHall();
        calcLectureHall = new LectureHall();
        uni.addStudent(karli.withName("Karli"));
        mathLectureHall.setCourse(mathCourse); // could use with for mathCourse
        calcLectureHall.setCourse(calculusCourse);
    }

    @Test
    public void karliEntersFirstClassMovesOnToSecond(){
        preCondition();
        mathCourse.addStudent(karli);
        calculusCourse.addStudent(karli);
        // math doesn't contain karli
        assertTrue("karli should have left math lecture hall",
                !mathLectureHall.getCourse().getStudents().contains(karli));

        //calc contains karli
        assertTrue("karli should have joined calc lecture hall",
                calcLectureHall.getCourse().getStudents().contains(karli));
    }



}