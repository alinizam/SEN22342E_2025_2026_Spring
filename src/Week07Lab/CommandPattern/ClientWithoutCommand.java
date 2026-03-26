package Week07Lab.CommandPattern;

public class ClientWithoutCommand {
    static void main() {
        TextEditor te = new TextEditor();
        te.add("Ahmet");
        te.display();
        te.add(" AK");
        te.display();
        te.delete("Mehmet");
        te.display();
    }
}
