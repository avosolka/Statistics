import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {
    @Test
    public void shouldSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatService service = new StatService();

        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAvg() {
        StatService service = new StatService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.avg(sales);
        long expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMin() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatService service = new StatService();
        long actual = service.minSales(sales);
        long expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMax() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatService service = new StatService();
        long actual = service.maxSales(sales);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldAboveAvg() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatService service = new StatService();
        long actual = service.countAboveAvg(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBelowAvg() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatService service = new StatService();
        long actual = service.countBelowAvg(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }

}


