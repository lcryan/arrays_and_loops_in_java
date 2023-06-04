import java.util.HashMap;
import java.util.Map;

public class Translator {
    Map<Integer, String> numericAlpha = new HashMap<Integer, String>(); // remember : Not HashMap - but usually Map<> !

    public Translator(int[] numeric, String[] alphabetic) {
        for (int i = 0; i < alphabetic.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]); // here! Watch out, that you also "get" from the numericAlpha below!!! //
        }
    }

    public String translate(Integer number) {
        return numericAlpha.get(number);
    }
}


