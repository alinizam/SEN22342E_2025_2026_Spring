package Week07Lab.CommandPatternWithRunnable;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        /*
        Runnable runnable = textEditor::addAhmet;
        runnable.run();
        System.out.println(textEditor.context);
        */
        ArrayList<Runnable> runnables = new ArrayList<>();
        runnables.add(textEditor::addAhmet);
        runnables.add(textEditor::addMehmet);
        runnables.add(textEditor::addAhmet);
        for(Runnable r:runnables){
            r.run();
        }
        System.out.println(textEditor.context);
    }
}
