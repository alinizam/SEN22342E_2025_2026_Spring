package Week06Lab.QuestionCoR;

class Manager extends LeaveApprover {
    private static final int MAX_DAYS_CAN_APPROVE = 7;

    public Manager(String name) {
        super(name);
    }

    @Override
    public void processLeaveRequest(LeaveRequest request) {
        if (request.getNumberOfDays() <= MAX_DAYS_CAN_APPROVE) {
            System.out.println(approverName + " (Manager) APPROVED " + request);
        } else if (nextApprover != null) {
            System.out.println(approverName + " (Manager) FORWARDING request to next approver - " + request);
            nextApprover.processLeaveRequest(request);
        } else {
            System.out.println("Leave request cannot be processed at this time.");
        }
    }
}
