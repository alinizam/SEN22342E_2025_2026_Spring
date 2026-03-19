package Week06Lab.Question1FlyWeigtComposite;

import java.util.HashMap;

public class ColorFactory {
    static HashMap<String,Color> colors = new HashMap<>();

    static Color getColor(String colorName) {
        //return colors.computeIfAbsent(colorName, c -> new Color(c));
        return colors.computeIfAbsent(colorName, Color::new);
        /*if(colors.containsKey(colorName)) {
            return colors.get(colorName);
        }else{
            Color c=new Color(colorName);
            colors.put(colorName,c);
            return c;
        }*/

    }

}
