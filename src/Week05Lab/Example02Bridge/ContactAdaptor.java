package Week05Lab.Example02Bridge;

public class ContactAdaptor implements ITranslate {
    Contact page;
    public ContactAdaptor(Contact page){
        this.page=page;
    }
    @Override
    public void sayLanguage() {
        page.changeDifferentLanguage();
    }
}
