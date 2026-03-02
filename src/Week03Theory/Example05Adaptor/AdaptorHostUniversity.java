package Week03Theory.Example05Adaptor;

public class AdaptorHostUniversity implements Adaptor{
    HostUniversity hostUniversity;
    public AdaptorHostUniversity(HostUniversity hostUniversity){
        this.hostUniversity = hostUniversity;
    }
    public void giveGrade(){
        System.out.println("Additional adoptation lojic");
        hostUniversity.assignGrade();
    }
}
