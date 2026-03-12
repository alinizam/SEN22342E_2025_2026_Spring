package Week05Lab.Example01Adaptor;

public class Client {
    static void main() {
        IPaymentAdaptor adaptor = new CreditCardPayment();
        adaptor.chargeCard(100);
        IPaymentAdaptor adaptor2 = new CashAdaptor(new CashPayment());
        adaptor2.chargeCard(100);
    }
}
