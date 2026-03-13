package Week05Theory.Proxy;

public class Client {
    static void main() {
        Server server=new WebServer();
        Server securityProxy=new SecurityProxy(server);
        Server proxyLB=new LoadBalancingProxy(securityProxy);
        proxyLB.request("admin", "123");
    }
}
