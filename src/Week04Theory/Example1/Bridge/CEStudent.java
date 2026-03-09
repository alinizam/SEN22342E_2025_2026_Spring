package Week04Theory.Example1.Bridge;

public class CEStudent extends Student {
    CEStudent(IEducationStatu status) {
        super(status);
        this.department="CE";
    }
}
