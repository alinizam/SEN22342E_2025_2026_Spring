package Week10Theory.TemplatePattern;

public abstract class TemplateAlgorithm {
    abstract void metot1();
    abstract void metot2();
    abstract void metot3();
    final void templateMethod(){
        metot1();
        metot2();
        metot3();
    }

}
