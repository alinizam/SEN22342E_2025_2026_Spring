package Week07Theory.Mediator;

public class User extends IUser {
    String name;
    User(IMediator mediator,String name) {
        super(mediator,name);
        this.name=name;
    }

    @Override
    void sendMessage(IUser user, String message) {
        mediator.sendMessage(user,message);
    }

    @Override
    void sendAll(String message) {
        mediator.sendAll(this,message);
    }

    @Override
    void receiveMessage(String message) {
        System.out.println(name+ " received message: " + message);
    }
}
