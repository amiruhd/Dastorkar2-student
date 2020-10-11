public class Student {
    /**
     @author AmirHossein
     **/

    //name
    private String firstName ;
    // lastname
    private String lastName ;
    // id
    private String ID ;
    // grade
    private int Grade;

    public Student(String fname , String lname , String id){
        firstName = fname ;
        lastName = lname ;
        ID = id ;
        Grade = 0 ;
    }

    /** *
     *  get the first name of student * @return firstName field
     *  */

    public String getFirstName() {
        return firstName;
    }

    /**
     *  * @param firstName set first name of a student
     *  */

    public void setFirstName(String fName) {
        firstName = fName;
    }

    /** * Print the student’s last name and ID number to the output terminal. */

    public void print() {

        System.out.println(firstName + lastName + ", student ID: " +        ID + ", grade: " + Grade);
    }
    public void setGrade(int grade){
        Grade = grade;

    }
}