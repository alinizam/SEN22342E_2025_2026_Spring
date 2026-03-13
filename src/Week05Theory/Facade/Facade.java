package Week05Theory.Facade;

public class Facade {
    void manageEducation(){
        RegitrationSubSystem r=new RegitrationSubSystem();
        r.giveStatus();
        EducationSubsystem e=new EducationSubsystem();
        e.giveStatus();
        GraduateSubSystem g=new GraduateSubSystem();
        g.giveStatus();

    }
}
