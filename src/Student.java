public class Student {

    private String firstname, lastname;
    private int grade;
    private double gpa;

    /**
     * Parametricized constructors for class Student
     * @param fn First name, a String
     * @param ln Last name, a String
     * @param gr Grade, an int
     * @param gp GPA, a double
     */

    public Student(String fn, String ln, int gr, double gp)    {

        firstname = fn;
        lastname = ln;
        grade = gr;
        gpa = gp;

    }

    //ACCESSOR METHODS
    public String getFirstname()    {    return firstname;    }
    public String getLastname()        {    return lastname;    }
    public int getGrade()   {return grade;}
    public double getGpa()  {return gpa;}

    //MUTATOR METHODS
    public void setFirstname (String newFN)     {   firstname = newFN;  }
    public void setLastname (String newLN)      {    lastname = newLN;  }
    public void setGrade (int newGrade)         {   grade = newGrade;   }
    public void setGpa (double newGpa)          {    gpa = newGpa;      }
}

//Single line comment

/*
Multiline comments
Go in here
Javadoc do the thing up top with "parametricized constructors"
 */