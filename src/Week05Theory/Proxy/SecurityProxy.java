package Week05Theory.Proxy;

public class SecurityProxy implements Server {
    Server server;
    SecurityProxy(Server server) {
        this.server = server;
    }
    @Override
    public void request(String user, String password) {
        if (user.equals("admin") && password.equals("123")) {
            System.out.println("Valid user and password");
            server.request(user, password);
        }else{
            System.out.println("Invalid user or password");
        }
    }
}
