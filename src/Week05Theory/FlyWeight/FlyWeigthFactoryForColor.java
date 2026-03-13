package Week05Theory.FlyWeight;

import java.util.HashMap;

public class FlyWeigthFactoryForColor {
    static HashMap<String,Color> colors=new  HashMap<>();
    static Color getColor(String colorName){
        if(colors.containsKey(colorName)){
            return colors.get(colorName);
        }else{
            Color color=new Color(colorName);
            colors.put(colorName,color);
            return color;
        }
    }
}
