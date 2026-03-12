package Week05Lab.Example02Bridge;

public class TranslateEnglish implements ITranslate {
    @Override
    public void sayLanguage() {
        System.out.println("English");
    }
}
