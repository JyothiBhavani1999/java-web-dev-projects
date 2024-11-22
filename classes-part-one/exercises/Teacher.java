package exercises.classespart1;

public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;
    private  int yearSTeaching;

    public  Teacher(String firstName, String lastName, String subject, int yearSTeaching){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject =subject;
        this.yearSTeaching= yearSTeaching;

    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void  setSubject(String subject){
        this.subject = subject;
    }
    public  void setYearSTeaching(int yearSTeaching)
    {
        this.yearSTeaching = yearSTeaching;
    }
}
