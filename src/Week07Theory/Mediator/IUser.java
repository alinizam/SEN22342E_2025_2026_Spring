package Week07Theory.Mediator;

public abstract class IUser {
    IMediator mediator;
    String name;
    public IUser(IMediator mediator,String name) {
        this.mediator = mediator;
        this.mediator.getUsers().add(this);
        this.name = name;
    }
    abstract void sendMessage(IUser user,String message);
    abstract void sendAll(String message);
    abstract void receiveMessage(String message);
}
