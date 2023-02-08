import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator sum;
    @Before
    public void setup(){
        sum = new Calculator();
    }

    @Test
    public void addingWorks() {
        assertEquals(18, sum.addTo(13, 5));
    }

    @Test
    public void subtractingWorks() {
        assertEquals(8, sum.subtractFrom(13, 5));
    }

    @Test
    public void multiplyingWorks() {
        assertEquals(65, sum.multiplyBy(13, 5));
    }

    @Test
    public void dividingWorks() {
        assertEquals(2.6, sum.divideBy(13.0, 5.0), 0.0);
    }
}

