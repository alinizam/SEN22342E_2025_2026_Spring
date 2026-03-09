package Week04Theory.Example1.Bridge;

public abstract class Student {
    IEducationStatu status; //Bridge
    String department;
    Student(IEducationStatu status) {
        this.status = status;
    }
    void determineCurrentStatus(){
        System.out.print(department+":");
        status.sayMyStatu();
    }

}
