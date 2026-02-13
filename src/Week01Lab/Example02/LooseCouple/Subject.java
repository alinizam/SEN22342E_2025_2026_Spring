package Week01Lab.Example02.LooseCouple;

public class Subject {
    IService service;
    void callService(IService service){
        service.doSomething();
    }

}
