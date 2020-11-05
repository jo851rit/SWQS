import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KalenderTest {
    @Test
    public void januaryDayValid(){
        Kalender kalender = new Kalender();

        boolean tagGueltig = kalender.tagGueltig(31,1);

        assertTrue(tagGueltig);
    }

    @Test
    public void februaryDayValid(){
        Kalender kalender = new Kalender();

        boolean tagGueltig = kalender.tagGueltig(29,2);

        assertTrue(tagGueltig);
    }

    @Test
    public void monthInvalid(){
        Kalender kalender = new Kalender();

        boolean tagGueltig = kalender.tagGueltig(4,6);

        assertFalse(tagGueltig);
    }

    @Test
    public void dayInvalid(){
        Kalender kalender = new Kalender();

        boolean tagGueltig = kalender.tagGueltig(40,3);

        assertFalse(tagGueltig);
    }
}