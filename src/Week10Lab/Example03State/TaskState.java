package Week10Lab.Example03State;

public interface TaskState {
    void rejectAction(Task taskState);
    void completeAction(Task taskState);
    void claimAction(Task taskState);

}
