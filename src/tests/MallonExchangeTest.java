package tests;

import com.company.contracts.MallonExchange;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MallonExchangeTest {

    @Test
    public void testMockedPrice() {

        MallonExchange mallonExchange = mock(MallonExchange.class);

        when(mallonExchange.getPrice("APPL", 100)).thenReturn(100.00);


    }


}
