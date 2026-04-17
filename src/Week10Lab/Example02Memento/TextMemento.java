package Week10Lab.Example02Memento;

public class TextMemento {
    StringBuilder text;
    TextMemento(StringBuilder text){
        this.text = text;
    }
    StringBuilder getText(){
        return text;
    }
}
