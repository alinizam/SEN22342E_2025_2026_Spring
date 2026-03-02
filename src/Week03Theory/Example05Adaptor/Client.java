package Week03Theory.Example05Adaptor;

public class Client {
    static void main() {
        Adaptor a=new AdaptorHostUniversity(new HostUniversity());
        a.giveGrade();
        a=new HomeUniversity();
        a.giveGrade();
    }
}
