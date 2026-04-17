package Week10Lab.Example03State;

public class Task {
    TaskState taskState;
    Task(){
        taskState = new PendingState();
    }
    void displayState(){
        System.out.println("Task State: " + taskState);
    }
    void claimAction(){
        taskState.claimAction(this);
    }
    void completeAction(){
        taskState.completeAction(this);
    }
}
