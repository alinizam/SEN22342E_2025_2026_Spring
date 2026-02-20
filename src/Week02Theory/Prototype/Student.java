package Week02Theory.Prototype;

public class Student implements Cloneable {
    private String firstName;
    private String lastName;
    private int departmentID;
    private String educationLanguage;
    Student(String firstName, String lastName, int departmentID, String educationLanguage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentID = departmentID;
        this.educationLanguage = educationLanguage;

    }

    public String getFirstName() {
        return firstName;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEducationLanguage() {
        return educationLanguage;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
