package Week05Lab.Example02Bridge;

public abstract class WebPage implements ITranslate {
    ITranslate iTranslate;
    WebPage(ITranslate iTranslate) {
        this.iTranslate = iTranslate;
    }

    @Override
    public void sayLanguage() {
        iTranslate.sayLanguage();
    }

    void changeLanguage(ITranslate iTranslate){
        this.iTranslate=iTranslate;
    }
    //Other page methods

}
