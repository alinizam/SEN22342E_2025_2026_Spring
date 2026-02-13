package Week01Lab.Example02.LosseCoupleWithMethodParameter.LooseCouple;

public class Subject {
    IService service;
    void callService(IService service){
        service.doSomething("");
        //Service direct parameter sending is not a good practice
        //So we need to add an unnecessary empty string
    }

}
