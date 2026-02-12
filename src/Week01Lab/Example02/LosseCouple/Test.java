package Week01Lab.Example02.LosseCouple;

public class Test {
    static void main() {
        Subject subject=new Subject();
        subject.callService(new ServiceClass());
        //local class
        class LocalService implements IService{
            @Override
            public void doSomething() {
                System.out.println("the local servis is working");
            }
        };
        IService ls=new LocalService();
        subject.callService(ls);
        //Anonym class
        IService ac=new IService() {
            @Override
            public void doSomething() {
                System.out.println("The anonym class is working");
            }
        };
        subject.callService(ac);
        //lambda expression
        IService lambdaService=()->{System.out.println("The lambda class is working");};
        IService lambdaService1=()->System.out.println("The lambda class is working");
        subject.callService(lambdaService);
    }
}
