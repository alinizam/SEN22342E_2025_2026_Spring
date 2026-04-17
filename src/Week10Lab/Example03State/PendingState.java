package Week10Lab.Example03State;

public class PendingState implements TaskState {
    @Override
    public void rejectAction(Task taskState) {
        System.out.println("Reject action");
    }

    @Override
    public void completeAction(Task taskState) {
        System.out.println("Complete action not supported");
    }

    @Override
    public void claimAction(Task taskState) {
        taskState.taskState=new InProgressState();
    }
}
