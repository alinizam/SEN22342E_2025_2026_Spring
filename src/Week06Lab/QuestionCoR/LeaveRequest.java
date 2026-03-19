package Week06Lab.QuestionCoR;

class LeaveRequest {
    private String employeeName;
    private int numberOfDays;
    private String reason;

    public LeaveRequest(String employeeName, int numberOfDays, String reason) {
        this.employeeName = employeeName;
        this.numberOfDays = numberOfDays;
        this.reason = reason;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public String getReason() {
        return reason;
    }

    @Override
    public String toString() {
        return "Leave Request Employee: " + employeeName +
                ", Days: " + numberOfDays +
                ", Reason: " + reason;
    }
}
