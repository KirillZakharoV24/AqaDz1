
import org.junit.Test;
import ru.topacademy.CashBackService;
import org.junit.Assert;
public class CashBackServiceTest {
    @org.junit.Test
    public void testServiceInBoundary() {
        CashBackService service = new CashBackService();

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void testServiceUnderBoundary() {
        CashBackService service = new CashBackService();

        int expected = 10;
        int actual = service.remain(990);

        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void testServiceBelowBoundary() {
        CashBackService service = new CashBackService();

        int expected = 990;
        int actual = service.remain(1010);

        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void testServiceBorderBoundary() {
        CashBackService service = new CashBackService();

        int expected = 1;
        int actual = service.remain(999);

        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void testServiceBorderBoundary1() {
        CashBackService service = new CashBackService();

        int expected = 999;
        int actual = service.remain(1001);

        Assert.assertEquals(expected,actual);
    }
}