package Week10Lab.Example02Memento;

public class TextEditor {
    private StringBuilder text = new StringBuilder();
    void addText(String text){
        this.text.append(text);
    }
    TextMemento saveContent(){
        return new TextMemento(new StringBuilder(text));
    }
    void restoreContent(TextMemento memento){
        text = memento.getText();
    }

}
