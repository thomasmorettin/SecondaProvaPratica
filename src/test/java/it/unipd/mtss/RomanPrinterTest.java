////////////////////////////////////////////////////////////////////
// Thomas       Morettin    2111001
// Andrea       Tito        2111033
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Before;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanPrinterTest {
    @Test
    public void test_IllegalArgumentExceptio() {
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(0));
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(1001));
    }

    @Test
    public void testMethod_Print() {
        RomanPrinter rp = new RomanPrinter();
        String ascii = rp.print(1);

        assertEquals(" _____  \n" +
                "|_   _| \n" +
                "  | |   \n" +
                "  | |   \n" +
                " _| |_  \n" +
                "|_____| \n", ascii);
        assertEquals(" _____  " + " _____  \n" +
                "|_   _| " + "|_   _| \n" +
                "  | |   " + "  | |   \n" +
                "  | |   " + "  | |   \n" +
                " _| |_  " + " _| |_  \n" +
                "|_____| " + "|_____| \n", RomanPrinter.print(2));
        assertEquals(" _____  " + " _____  " + " _____  \n" +
                "|_   _| " + "|_   _| " + "|_   _| \n" +
                "  | |   " + "  | |   " + "  | |   \n" +
                "  | |   " + "  | |   " + "  | |   \n" +
                " _| |_  " + " _| |_  " + " _| |_  \n" +
                "|_____| " + "|_____| " + "|_____| \n", RomanPrinter.print(3));
    }
}

