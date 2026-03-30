package Week07Theory.Mediator;

import java.util.ArrayList;

public interface IMediator {
    void sendMessage(IUser user,String message);
    void sendAll(IUser user,String message);
    ArrayList<IUser> getUsers();
}
