package Week05Lab.Example02Bridge;

public class Client {
    static void main() {
        ITranslate page = new Home(new TranslateEnglish());
        page.sayLanguage();
        WebPage page2 = new Services(new TranslateTurkish());
        page2.sayLanguage();
        page2.changeLanguage(new TranslateEnglish());
        page2.sayLanguage();


        ITranslate page3=new ContactAdaptor(new Contact());
        page3.sayLanguage();
        page3.sayLanguage();

    }
}
