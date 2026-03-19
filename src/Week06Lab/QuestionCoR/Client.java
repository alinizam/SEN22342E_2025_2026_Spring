package Week06Lab.QuestionCoR;

public class Client {
    static void main() {
        LeaveRequest r=new LeaveRequest("Ahmet",10,"");
        LeaveApprover chain=new TeamLead("Ahmet");
        chain.setNextApprover(new Manager("Mehmet"));
        chain.processLeaveRequest(r);

    }
}
