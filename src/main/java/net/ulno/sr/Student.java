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
        this.university = university;
    }

    public University getUniversity()
    {
        return university;
    }
}
