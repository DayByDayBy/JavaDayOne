import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer gary;

    @Before
    public void setup() {
        gary = new Printer(100, 1000);
    }

    @Test
    public void checkCantPrint() {
        assertEquals("not enough paper, sorry", gary.printJob(25, 60));
    }
    @Test
    public void checkCanPrint() {
        assertEquals("printed 12 copies", gary.printJob(3, 4));
    }
    @Test
    public void doesUsePaper () {
        gary.printJob(80, 2);
        assertEquals(840, gary.getPaper());
    }

    @Test
    public void doesUseToner () {
        gary.printJob(80, 2);
        assertEquals(840, gary.getToner());
    }

}