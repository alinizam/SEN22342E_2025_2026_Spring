package Week10Lab.Example03State;

public class CompleteState implements TaskState{
    @Override
    public void rejectAction(Task taskState) {

    }

    @Override
    public void completeAction(Task taskState) {

    }

    @Override
    public void claimAction(Task taskState) {
        System.out.println("claiming action does not supported for CompleteState");
    }
}
