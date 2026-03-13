package Week05Theory.Proxy;

public class LoadBalancingProxy implements Server{

    private Server server;
    public LoadBalancingProxy(Server server) {
        this.server=server;
    }
    public void request(String user, String password) {
        System.out.println("load is distributed");
        server.request(user, password);
    }
}
