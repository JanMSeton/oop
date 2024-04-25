import java.time.LocalDateTime;

public class Assignment {
    public String name;
    public final LocalDateTime deadline;
    public Assignment(String assignmentName, LocalDateTime assignmentDeadline)
    {
        name = assignmentName;
        deadline  = assignmentDeadline;
    }
}
