package Week08Midterm.Question;

public class ServerAdaptor implements Command {

    InternationalServer server;
    ServerAdaptor(InternationalServer server) {
        this.server = server;
    }
    public void execute() {
        server.internationalPlaceOrder();
    }
}
