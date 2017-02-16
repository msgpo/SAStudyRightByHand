package net.ulno.sr;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by ulno on 2/16/17.
 */
public class University {
    private Set<Student> students
            = new LinkedHashSet<Student>();


    public boolean addStudent(Student student)
    {
        boolean changed = students.add( student );
        if( changed && student != null ) {
            student.setUniversity(this);
        }
        // you might want to check the parameter here
        return changed;
    }

    public boolean removeStudent(Student student)
    {
        boolean changed = students.remove(student);
        if( changed && student != null ) {
            student.setUniversity(null);
        }
        return changed;
    }

    // don't expose the concrete container class
    public Set<Student> getStudents()
    {
        return Collections.unmodifiableSet(students);
    }

}
