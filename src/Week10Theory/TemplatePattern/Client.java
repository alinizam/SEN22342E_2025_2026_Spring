package Week10Theory.TemplatePattern;

public class Client {
    public static void main(String[] args) {
        TemplateAlgorithm a=new ConcreateAlgorithm();
        a.templateMethod();
    }
}
