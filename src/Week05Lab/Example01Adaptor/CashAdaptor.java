package Week05Lab.Example01Adaptor;

public  class CashAdaptor implements IPaymentAdaptor {
    CashPayment payment;
    CashAdaptor(CashPayment payment) {
        this.payment = payment;
    }
    public  void chargeCard(int amount) {
        payment.sendMoney(amount);
    }
}
