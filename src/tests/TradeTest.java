package tests;

import com.company.exceptions.TradeIDException;
import com.company.lab3.Trade;
import org.junit.Assert;
import org.junit.Test;

public class TradeTest {

    @Test
    public void testThrowTradeIdException() {
        Assert.assertThrows(TradeIDException.class, () -> {
           new Trade("1", "11", 1, 1);
           new Trade("1", "11", 1, 1);
        });
    }
}
