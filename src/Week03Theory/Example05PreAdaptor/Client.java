package Week03Theory.Example05PreAdaptor;

public class Client {
    public static void main(String[] args) {
        HomeUniversity homeUniversity = new HomeUniversity();
        homeUniversity.giveGrade();
        HostUniversity hostUniversity = new HostUniversity();
        hostUniversity.assignGrade();
    }
}
