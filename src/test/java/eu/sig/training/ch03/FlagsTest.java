package eu.sig.training.ch03;

import static org.junit.Assert.assertEquals;

import java.awt.Color;
import java.util.List;

import org.junit.Test;

public class FlagsTest {

    @Test
    public void testGetDucthFlag() {
        FlagFactory factory = new FlagFactory();

        List<Color> colors = factory.getFlagColors(Nationality.DUTCH);

        assertEquals(Color.RED, colors.get(0));
        assertEquals(Color.WHITE, colors.get(1));
        assertEquals(Color.BLUE, colors.get(2));
    }
    
    @Test
    public void testGetIrelandFlag() {
        FlagFactory factory = new FlagFactory();

        List<Color> colors = factory.getFlagColors(Nationality.IRELAND);

        assertEquals(Color.GREEN, colors.get(0));
        assertEquals(Color.WHITE, colors.get(1));
        assertEquals(Color.ORANGE, colors.get(2));
    }
    
}
