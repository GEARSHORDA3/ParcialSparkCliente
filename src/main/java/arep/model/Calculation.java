package arep.model;
import java.util.Locale;

public class Calculation {

    /**
     *  calculate a value
     * @param number number to calculate
     * @param word type of operation as cos,tan,sin
     * @return
     */
    public double calculate(String number, String word) {
        String operation = word.toLowerCase(Locale.ROOT);
        if(operation=="sin"){
            return Math.sin(Double.parseDouble(number));
        }else if(operation=="cos"){
            return Math.cos(Double.parseDouble(number));
        }else{
           return Math.tan(Double.parseDouble(number));
        }
    }
}
