package net.ulno.sr;

/**
 * Created by ulno on 2/16/17.
 */
public class Student {
    private String name;

    public void setName(String name)
    {
        if (name == null)
        {
            throw new IllegalArgumentException(
                    "Student name must not be null!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private University university;

    public void setUniversity(University university)
    {
        if( this.university != university) {
            University oldValue = this.university;
            this.university = university;
            if( oldValue != null ) {
                oldValue.removeStudent( this );
            }
            if( university != null ) {
                university.addStudent( this );
            }
        }
    }

    public University getUniversity()
    {
        return university;
    }

    public Student withName(String name){
        this.setName(name);
        return this;
    }

    private Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course){
        if(this.getCourse() != course){
            Course oldValue = this.getCourse();
            this.course = course;

            if(oldValue != null){
                oldValue.removeStudent(this);
            }
            if(course != null){
                course.addStudent(this);
            }
        }
    }

}
