package Week07Lab.CommandPattern;

public class TextEditor {

    StringBuilder context=new StringBuilder();

    void add(String s){
        context.append(s);
    }
    void delete(String s){
        context.replace(0,s.length(),s);
    }
    void display(){
        System.out.println(context);
    }
}
