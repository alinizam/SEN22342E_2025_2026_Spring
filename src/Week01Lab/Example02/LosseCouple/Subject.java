package Week01Lab.Example02.LosseCouple;

public class Subject {
    IService service;
    void callService(IService service){
        service.doSomething();
    }

}
