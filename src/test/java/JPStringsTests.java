import org.example.JPStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JPStringsTests {

    @Test
    void testCapitalitzar(){
        JPStrings jpStrings = new JPStrings();

        assertEquals("Gerard", JPStrings.capitalitzar("gerard"));
        assertEquals("Gerard", JPStrings.capitalitzar("GERard"));
        assertEquals("Gerard", JPStrings.capitalitzar("gerARD"));
        assertEquals("Gerard", JPStrings.capitalitzar("Grard"));

        assertEquals("Gerard", JPStrings.capitalitzar("gerard"));
        assertEquals("Gerard", JPStrings.capitalitzar("GERard"));
        assertEquals("Gerard", JPStrings.capitalitzar("gerARD"));



        assertEquals("\033[31mg\033[32me", JPStrings.colorear("ge"));

    }

    @Test
    void testLeftPad() {
        assertEquals("    casa", JPStrings.leftPad("casa", 8));
        assertEquals("      no", JPStrings.leftPad("no", 8));
    }

}
