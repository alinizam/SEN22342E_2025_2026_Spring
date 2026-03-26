package Week07Lab.CommandPattern;

import java.util.ArrayList;

public class ClientWithCommand {
    static void main(){
        ArrayList<Command> redoCommand=new ArrayList<>();
        TextEditor textEditor=new TextEditor();
        redoCommand.add(new AddCommand(textEditor,"Ahmet"));
        redoCommand.add(new AddCommand(textEditor," Ak"));
        redoCommand.add(new AddCommand(textEditor,"Oğlu"));
        textEditor.display();
        for(Command command:redoCommand){
            command.execute();
        }
        textEditor.display();
    }
}
