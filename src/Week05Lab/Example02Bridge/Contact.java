package Week05Lab.Example02Bridge;

public class Contact {
    String language;
    void changeDifferentLanguage(){
        if(language=="Turkish") {
            System.out.println("English");
            language = "English";
        }else {
            System.out.println("Turkish");
            language = "Turkish";
        }
    };
}
