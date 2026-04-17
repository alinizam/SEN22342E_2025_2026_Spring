package Week10Lab.Example02Memento;

public class Client {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        HistoryManager history = new HistoryManager();
        textEditor.addText("Hello World");
        history.saveHistory(textEditor.saveContent());
        textEditor.addText("Again");
        history.saveHistory(textEditor.saveContent());
        history.undo();
        history.undo();
        history.redo();
    }
}
