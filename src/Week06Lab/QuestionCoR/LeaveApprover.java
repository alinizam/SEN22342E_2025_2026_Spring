package Week06Lab.QuestionCoR;

abstract class LeaveApprover {
    protected LeaveApprover nextApprover;
    protected String approverName;

    public LeaveApprover(String approverName) {
        this.approverName = approverName;
    }

    // Set the next approver in the chain
    public void setNextApprover(LeaveApprover nextApprover) {
        this.nextApprover = nextApprover;
    }

    // Abstract method to process the leave request
    public abstract void processLeaveRequest(LeaveRequest request);
}

