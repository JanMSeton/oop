import java.time.LocalDateTime;

public class Submission {
    public int quality;
    public LocalDateTime submitTime;
    private Student  submitter;
    public Assignment submission;


    public Submission(Assignment submittedAssignment, Student submitterOfAssignment)
    {
        quality = submitterOfAssignment.knowledgeLevel;
        submitTime = LocalDateTime.now();
    }
}
