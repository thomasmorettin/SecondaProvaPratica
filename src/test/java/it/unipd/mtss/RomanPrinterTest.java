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
	assertEquals(" _____  " + "__      __ \n" +
                "|_   _| " + "\\ \\    / / \n" +
                "  | |   " + " \\ \\  / /  \n" +
                "  | |   " + "  \\ \\/ /   \n" +
                " _| |_  " + "   \\  /    \n" +
                "|_____| " + "    \\/     \n", RomanPrinter.print(4));
        assertEquals("__      __ \n" +
                "\\ \\    / / \n" +
                " \\ \\  / /  \n" +
                "  \\ \\/ /   \n" +
                "   \\  /    \n" +
                "    \\/     \n", RomanPrinter.print(5));
        assertEquals("__      __ " + " _____  \n" +
                "\\ \\    / / " + "|_   _| \n" +
                " \\ \\  / /  " + "  | |   \n" +
                "  \\ \\/ /   " + "  | |   \n" +
                "   \\  /    " + " _| |_  \n" +
                "    \\/     " + "|_____| \n", RomanPrinter.print(6));
	assertEquals("__      __ " + " _____  " + " _____  \n" +
                "\\ \\    / / " + "|_   _| " + "|_   _| \n" +
                " \\ \\  / /  " + "  | |   " + "  | |   \n" +
                "  \\ \\/ /   " + "  | |   " + "  | |   \n" +
                "   \\  /    " + " _| |_  " + " _| |_  \n" +
                "    \\/     " + "|_____| " + "|_____| \n", RomanPrinter.print(7));
        assertEquals(" _____  " + "__   __ \n" +
                "|_   _| " + "\\ \\ / / \n" +
                "  | |   " + " \\ V /  \n" +
                "  | |   " + "  > <   \n" +
                " _| |_  " + " / . \\  \n" +
                "|_____| " + "/_/ \\_\\ \n", RomanPrinter.print(9));
        assertEquals("__   __ \n" +
                "\\ \\ / / \n" +
                " \\ V /  \n" +
                "  > <   \n" +
                " / . \\  \n" +
                "/_/ \\_\\ \n", RomanPrinter.print(10));
	assertEquals("__   __ " + "__      __ \n" +
                "\\ \\ / / " + "\\ \\    / / \n" +
                " \\ V /  " + " \\ \\  / /  \n" +
                "  > <   " + "  \\ \\/ /   \n" +
                " / . \\  " + "   \\  /    \n" +
                "/_/ \\_\\ " + "    \\/     \n", RomanPrinter.print(15));
        assertEquals("__   __ " + " _____  " + "__   __ \n" +
                "\\ \\ / / " + "|_   _| " + "\\ \\ / / \n" +
                " \\ V /  " + "  | |   " + " \\ V /  \n" +
                "  > <   " + "  | |   " + "  > <   \n" +
                " / . \\  " + " _| |_  " + " / . \\  \n" +
                "/_/ \\_\\ " + "|_____| " + "/_/ \\_\\ \n", RomanPrinter.print(19));
        assertEquals("__   __ " + "__   __ \n" +
                "\\ \\ / / " + "\\ \\ / / \n" +
                " \\ V /  " + " \\ V /  \n" +
                "  > <   " + "  > <   \n" +
                " / . \\  " + " / . \\  \n" +
                "/_/ \\_\\ " + "/_/ \\_\\ \n", RomanPrinter.print(20));
	
    }
}

