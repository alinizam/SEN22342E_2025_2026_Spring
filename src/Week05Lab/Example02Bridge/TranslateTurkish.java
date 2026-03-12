package Week05Lab.Example02Bridge;

public class TranslateTurkish implements ITranslate {
    @Override
    public void sayLanguage() {
        System.out.println("Turkish");
    }
}
