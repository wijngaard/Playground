package eu.sig.training.ch03;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static eu.sig.training.ch03.Nationality.*;

public class FlagFactory {

    private Map<Nationality, List<Color>> flagMap = new HashMap<>();

    public FlagFactory() {
        flagMap.put((DUTCH), Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
        flagMap.put(GERMAN, Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW));
        flagMap.put(BELGIAN, Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED));
        flagMap.put(FRENCH, Arrays.asList(Color.BLUE, Color.WHITE, Color.RED));
        flagMap.put(ITALIAN, Arrays.asList(Color.GREEN, Color.WHITE, Color.RED));
        flagMap.put(ROMANIA, Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED));
        flagMap.put(IRELAND, Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE));
        flagMap.put(HUNGARIAN, Arrays.asList(Color.RED, Color.WHITE, Color.GREEN));
        flagMap.put(BULGARIAN, Arrays.asList(Color.WHITE, Color.GREEN, Color.RED));
        flagMap.put(RUSSIA, Arrays.asList(Color.WHITE, Color.BLUE, Color.RED));
        flagMap.put(UNCLASSIFIED, Arrays.asList(Color.GRAY));
    }

    // tag::getFlag[]
    public List<Color> getFlagColors(Nationality nationality) {
        List<Color> colors = flagMap.get(nationality);
        if(colors == null){
            return Arrays.asList(Color.GRAY);
        }
        return colors;
    }
    // end::getFlag[]

}
