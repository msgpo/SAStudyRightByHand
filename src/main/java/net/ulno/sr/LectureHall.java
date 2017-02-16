package net.ulno.sr;

/**
 * Created by ulno on 2/16/17.
 */
public class LectureHall
{
    private Course course;

    public void setCourse(Course course)
    {
        if (this.course != course)
        {
            Course oldValue = this.course;
            this.course = course;
            if (oldValue != null)
            {
                oldValue.setLectureHall(null);
            }
            if (course != null)
            {
                course.setLectureHall(this);
            }
        }
    }

    public Course getCourse()
    {
        return course;
    }
}

