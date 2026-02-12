package Week01Lab.Example02.TightCouple;

public class Subject {
    void callService(){
        Service s=new Service();
        s.message="Working";
        s.doSomething();

    }

}
