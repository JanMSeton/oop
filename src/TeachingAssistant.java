import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TeachingAssistant {
    public String name;
    public int gradeSubmission(Submission currentSubmission)
    {
        int grade;
        if(currentSubmission.submission.deadline.isBefore(currentSubmission.submitTime))
        {
            Random random = new Random();
            // Random number between submission quality and 10 (quality is at most 6)
            grade = random.nextInt(5) + currentSubmission.quality;
        }
        else
        {
            grade =  0;
        }
        System.out.println(grade);
        System.out.println(currentSubmission.submission.name);
        System.out.println(name);
        return grade;
    }
    public List<Integer> gradeList(List<Submission> submissionList)
    {
        List<Integer> returnList = new ArrayList<Integer>();
        for(Submission currentSubmission: submissionList)
        {
            returnList.add(gradeSubmission((currentSubmission)));
        }
        return returnList;
    }
}
