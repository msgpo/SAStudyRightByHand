package net.ulno.sr;

/**
 * Created by ulno on 2/16/17.
 */

import java.util.Collections;
        import java.util.LinkedHashSet;
        import java.util.Set;

public class Course
{

    private Set<Student> students
            = new LinkedHashSet<Student>();

    public boolean addStudent(Student student)
    {
        // you might want to check the parameter here
        return students.add(student);
    }

    public boolean removeStudent(Student student)
    {
        return students.remove(student);
    }

    // don't expose the concrete container class
    public Set<Student> getStudents()
    {
        return Collections.unmodifiableSet(students);
    }

    private LectureHall lectureHall;

    public void setLectureHall(LectureHall lectureHall)
    {
        if (this.lectureHall != lectureHall)
        {
            LectureHall oldValue = this.lectureHall;
            this.lectureHall = lectureHall;
            if (oldValue != null)
            {
                oldValue.setCourse(null);
            }
            if (lectureHall != null)
            {
                lectureHall.setCourse(this);
            }
        }
    }

    public LectureHall getLectureHall()
    {
        return lectureHall;
    }


}
