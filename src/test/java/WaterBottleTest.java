import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class WaterBottleTest {

    private WaterBottle waterbottle;
    @Before
    public void setup() {
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void checkDrank() {
        assertEquals(90, waterbottle.drinkWater());
    }

    @Test
    public void checkEmptied() {
        assertEquals(0, waterbottle.emptyBottle());
    }

    @Test
    public void checkFilled() {
        assertEquals(100, waterbottle.fillBottle());
    }
}