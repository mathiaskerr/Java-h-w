import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;
    @Before
    public void before() {
        printer = new Printer(100, 50);
    }
    @Test
    public void pagesLeftAfterPrint(){
        printer.print(25);
        assertEquals(75,printer.getPages());
    }

    @Test
    public void tonerLeftAfterPrint(){
        printer.print(25);
        assertEquals(25,printer.getToner());
    }
    @Test
    public void tonerAndPagesLeftAfterPrint(){
        printer.print(500);
        assertEquals(50,printer.getToner());
        assertEquals(100,printer.getPages());
    }


}
