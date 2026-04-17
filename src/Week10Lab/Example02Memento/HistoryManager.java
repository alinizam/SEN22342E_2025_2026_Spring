package Week10Lab.Example02Memento;

import java.util.Stack;

public class HistoryManager {
   private final  Stack<TextMemento> undoStack = new Stack<>();
   private final Stack<TextMemento> redoStack = new Stack<>();
   void saveHistory(TextMemento textMemento){
       undoStack.push(textMemento);
   }
   void undo(){
       if(!undoStack.isEmpty()){
           redoStack.push(undoStack.pop());
       }
   }
    void redo(){
        if(!redoStack.isEmpty()){
            undoStack.push(redoStack.pop());
        }
    }
}
