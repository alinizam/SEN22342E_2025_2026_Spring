package Week06Lab.Question2AdaptorProxy;

public class Client {
    static void main() {
        JobService adaptor=new Adaptor4New(new LegacyHR());
        JobService proxy=new SecurityProxy(adaptor);
        proxy.assign("Admin", "Admin");
    }
}
