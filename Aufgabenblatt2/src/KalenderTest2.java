import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KalenderTest2 {

    Kalender kalender;

    @Before
    public void setup() {
        kalender = new Kalender();
    }

    @After
    public void tearDown() {
        kalender = null;
    }

    @Test
    public void januaryDayValid() {
        boolean tagGueltig = kalender.tagGueltig(31, 1);
        assertTrue(tagGueltig);
    }

    @Test
    public void februaryDayValid() {
        boolean tagGueltig = kalender.tagGueltig(29, 2);
        assertTrue(tagGueltig);
    }

    @Test
    public void monthInvalid() {
        boolean tagGueltig = kalender.tagGueltig(4, 6);
        assertFalse(tagGueltig);
    }

    @Test
    public void dayInvalid() {
        boolean tagGueltig = kalender.tagGueltig(40, 3);
        assertFalse(tagGueltig);
    }

}