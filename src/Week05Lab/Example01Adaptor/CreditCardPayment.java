package Week05Lab.Example01Adaptor;


class CreditCardPayment implements IPaymentAdaptor {

    @Override
    public void chargeCard(int amount) {
        System.out.println("Credit Card charged: $" + amount);
    }
}

