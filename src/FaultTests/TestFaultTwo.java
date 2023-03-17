package FaultTests;

import org.junit.Assert;
import org.junit.Test;

public class TestFaultTwo {
    @Test
    public void findNumberAtZeroIndex() {
        int pos = FaultTwo.findLast(new int[] {2, 3, 5, 8}, 2);
        Assert.assertEquals(0, pos);
    }

    @Test
    public void findNumberAtLastIndex() {
        int pos = FaultTwo.findLast(new int[] {1, 3, 5, 2}, 2);
        Assert.assertEquals(3, pos);
    }

    @Test
    public void findNotExistingNumber() {
        int pos = FaultTwo.findLast(new int[] {1, 3, 5, 2}, 4);
        Assert.assertEquals(-1, pos);
    }

    @Test (expected = NullPointerException.class)
    public void findNumberInNull() {
       FaultTwo.findLast(null, 4);
    }


    @Test
    public void findNumberInEmptyArray() {
        int pos = FaultTwo.findLast(new int[] {}, 4);
        Assert.assertEquals(-1, pos);
    }

    @Test
    public void findLastNumberWhenMultiple() {
        int pos = FaultTwo.findLast(new int[] {2,2,2,2}, 2);
        Assert.assertEquals(3, pos);
    }
}
