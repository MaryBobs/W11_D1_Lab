import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;
    @Before
    public void before(){
        printer = new Printer(100);
    }

    @Test
    public void hasSheets(){
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void canPrint(){
        assertEquals(true, printer.print(2,5));
    }

    @Test
    public void cannotPrint(){
        assertEquals(false, printer.print(12,10));
    }

    @Test
    public void printReducesSheets(){
        printer.print(2,5);
        assertEquals(90, printer.getSheets());
    }
}
