package Week04Theory.Example1.Bridge;

public class SENStudent extends Student {
    SENStudent(IEducationStatu status) {
        super(status);
        this.department="SEN";
    }
}
