package Week07Theory.Mediator;

import java.util.ArrayList;

public class Mediator implements IMediator {
    ArrayList<IUser> users=new  ArrayList<>();
    @Override
    public void sendMessage(IUser user, String message) {
        System.out.println(user.name+" "+message);
    }

    @Override
    public void sendAll(IUser sender,String message) {
        for(IUser user:users){
            if(user!=sender){
                user.receiveMessage(message);
            }
        }
    }

    @Override
    public ArrayList<IUser> getUsers() {
        return users;
    }
}
