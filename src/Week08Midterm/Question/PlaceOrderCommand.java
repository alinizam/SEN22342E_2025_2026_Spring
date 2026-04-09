package Week08Midterm.Question;

public class PlaceOrderCommand implements Command {
    WebServer server;
    public PlaceOrderCommand(WebServer server) {
        this.server = server;
    }
    @Override
    public void execute() {
        server.placeOrder();
    }
}
