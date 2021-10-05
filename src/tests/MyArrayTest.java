package tests;

import com.company.arrays_lab.MyArray;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class MyArrayTest {

    @Test
    public void testMyArray()  {
        MyArray myArray = new MyArray(5);

        assertEquals(5, myArray.getData().length);
    }
}
