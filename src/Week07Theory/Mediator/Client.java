package Week07Theory.Mediator;

public class Client {
    public static void main(String[] args) {
        IMediator mediator = new Mediator();
        IUser u1=new User(mediator,"Ahmet");
        IUser u2=new User(mediator,"Mehmet");
        IUser u3=new User(mediator,"Ayşe");
        u1.sendAll("HEllo");
    }
}
