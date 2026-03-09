package Week04Theory.Example1.Bridge;

public class Client {
    public static void main(String[] args) {
        IEducationStatu status=new UnderGraduate();
        Student s=new SENStudent(status);
        s.determineCurrentStatus();

        Student ceStudent=new CEStudent(()-> System.out.println("PhD"));
        ceStudent.determineCurrentStatus();
    }
}
