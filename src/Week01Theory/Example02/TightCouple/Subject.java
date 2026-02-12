package Week01Theory.Example02.TightCouple;

public class Subject {
    void callService(){
        Service s=new Service();
        s.message="Working";
        s.doSomething();

    }

}
