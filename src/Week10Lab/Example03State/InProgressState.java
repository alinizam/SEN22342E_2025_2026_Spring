package Week10Lab.Example03State;

public class InProgressState implements TaskState{

    @Override
    public void rejectAction(Task task) {
        task.taskState=new PendingState();
    }

    @Override
    public void completeAction(Task task) {
        task.taskState=new CompleteState();
    }

    @Override
    public void claimAction(Task taskState) {
        System.out.println("claiming task doesn!t effect");
    }
}
