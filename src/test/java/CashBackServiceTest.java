import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.topacademy.CashBackService;

public class CashBackServiceTest {
    @Test
    void testServiceInBoundary() {
        CashBackService service = new CashBackService();

        int expected = 0;
        int actual = service.remain(1000);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void testServiceUnderBoundary() {
        CashBackService service = new CashBackService();

        int expected = 10;
        int actual = service.remain(990);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void testServiceBelowBoundary() {
        CashBackService service = new CashBackService();

        int expected = 990;
        int actual = service.remain(1010);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void testServiceBorderBoundary() {
        CashBackService service = new CashBackService();

        int expected = 1;
        int actual = service.remain(999);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void testServiceBorderBoundary1() {
        CashBackService service = new CashBackService();

        int expected = 999;
        int actual = service.remain(1001);

        Assertions.assertEquals(expected,actual);
    }
}