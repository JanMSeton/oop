import java.util.List;

public class Lecturer
{
    private String name;
    public Lecturer(String lecturerName)
    {
        name = lecturerName;
    }

    public void lecture(List<Student> attendees)
    {
        System.out.println("Making notes!");
        for(Student attendee: attendees)
        {
            ++attendee.knowledgeLevel;
        }

    }
}
