////////////////////////////////////////////////////////////////////
// Thomas       Morettin    2111001
// Andrea       Tito        2111033
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanPrinterTest {
    @Test
    public void test_IllegalArgumentExceptio() {
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(0));
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(1001));
    }
}