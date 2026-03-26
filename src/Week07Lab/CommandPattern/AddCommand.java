package Week07Lab.CommandPattern;

public class AddCommand implements Command {
    TextEditor editor;
    String s;
    public AddCommand(TextEditor editor,String s) {
        this.editor = editor;
        this.s = s;
    }

    @Override
    public void execute() {
        this.editor.add(s);
    }
}
