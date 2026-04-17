package Week10Lab.Example03State;

public class Client {
    static void main() {
        Task task = new Task();
        task.displayState();
        task.claimAction();
        task.displayState();
        task.completeAction();
        task.displayState();
        task.claimAction();
        task.displayState();
    }
}
