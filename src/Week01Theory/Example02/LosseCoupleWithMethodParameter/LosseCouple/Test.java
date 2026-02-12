package Week01Theory.Example02.LosseCoupleWithMethodParameter.LosseCouple;

public class Test {
    static void main() {
        Subject subject=new Subject();
        subject.callService(new ServiceClass());
        //local class
        class LocalService implements IService {
            @Override
            public void doSomething(String message) {
                System.out.println("the local servis is working");
            }
        };
        IService ls=new LocalService();
        subject.callService(ls);
        //Anonym class
        IService ac=new IService() {
            @Override
            public void doSomething(String message) {
                System.out.println("The anonym class is working");
            }
        };
        subject.callService(ac);
        //lambda expression
        IService lambdaService=(m)->{System.out.println(m);};
        IService lambdaService1=(m)->System.out.println(m);
        lambdaService.doSomething("Lambda");
        subject.callService(lambdaService);
    }
}
