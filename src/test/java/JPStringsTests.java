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
        assertEquals("Gerard", JPStrings.capitalitzar("Gerard"));

        assertEquals("Gerard", JPStrings.capitalitzar("gerard"));
        assertEquals("Gerard", JPStrings.capitalitzar("GERard"));
        assertEquals("Gerard", JPStrings.capitalitzar("gerARD"));



    }

    @Test
    void testLeftPad() {
        assertEquals("    casa", JPStrings.leftPad("casa", 8));
        assertEquals("      no", JPStrings.leftPad("no", 8));
    }

    @Test
    void testDays(){
        assertEquals("2 semanes",JPStrings.toWeekdays(14));
        assertEquals("1 setmana",JPStrings.toWeekdays(7));
        assertEquals("2 setmanes 1 dies",JPStrings.toWeekdays(15));
        assertEquals("5 semanes",JPStrings.toWeekdays(35));
        assertEquals("6 dies",JPStrings.toWeekdays(6));

    }
    @Test

    void testafegeixArroba(){
        assertEquals("@mbappe@",JPStrings.afegixArroba("mbappe",8 ,true ));
        assertEquals("mbappe",JPStrings.afegixArroba("mbappe",8 ,false ));
        assertEquals("mbappe",JPStrings.afegixArroba("mbappe",6 ,false ));
        assertEquals("mbappe",JPStrings.afegixArroba("mbappe",6 ,true ));
    }

}
