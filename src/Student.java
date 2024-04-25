public class Student
{
    public int knowledgeLevel;
    public String name;
    public void obtainKnowledge()
    {
        knowledgeLevel = Math.min(knowledgeLevel + 1, 6);
    }
    public Submission doAssignment(Assignment currentAssignment)
    {
        return new Submission(currentAssignment, this);
    }
    public Student(String name, int knowledgeLevel)
    {
        name = name;
        knowledgeLevel = knowledgeLevel;
    }

}
