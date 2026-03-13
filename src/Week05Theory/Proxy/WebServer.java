package Week05Theory.Proxy;

public class WebServer implements Server {
    @Override
    public void request(String user, String password) {
        System.out.println("Request is responsed");
    }

}
