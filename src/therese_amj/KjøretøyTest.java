package therese_amj;

import static org.junit.jupiter.api.Assertions.*;

class KjøretøyTest {

    @org.junit.jupiter.api.Test
    void printInformationKjøretøy() {
        var biltest = new Bil("El89476", 90, 300, "Km/t", "gul", true);
       var actual = biltest.PrintInformation();

        assertEquals("** Bil **\n" +
                "- Reg.nr =El89476\n" +
                "- Effekt =90\n" +
                "- Maksfart = 300Km/t\n" +
                "- Farge = gul\n" +
                "- Lett Kjøretøy", actual);
    }

    @org.junit.jupiter.api.Test
    void testOmviKanTesteKjøretøyklassen() {
        var kjøretøy = new KjøretøyMaxFart("TEST", 200, 200, "knop");
        var actual = kjøretøy.PrintInformation();

        assertEquals("- Reg.nr =TEST\n" +
                "- Effekt =200\n" +
                "- Maksfart = 200knop", actual);
    }
}