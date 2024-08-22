
import ru.topacademy.CashBackService;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CashBackServiceTest {
    @org.testng.annotations.Test
    public void testServiceInBoundary() {
        CashBackService service = new CashBackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void testServiceUnderBoundary() {
        CashBackService service = new CashBackService();

        int expected = 10;
        int actual = service.remain(990);

        assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void testServiceBelowBoundary() {
        CashBackService service = new CashBackService();

        int expected = 990;
        int actual = service.remain(1010);
        assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void testServiceBorderBoundary() {
        CashBackService service = new CashBackService();

        int expected = 1;
        int actual = service.remain(999);

        assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void testServiceBorderBoundary1() {
        CashBackService service = new CashBackService();

        int expected = 999;
        int actual = service.remain(1001);

        assertEquals(expected, actual);
    }
}
