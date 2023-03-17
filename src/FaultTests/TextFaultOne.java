package FaultTests;

import org.junit.Assert;
import org.junit.Test;

public class TextFaultOne {
    @Test
    public void testMultipleZeros(){
        //given setup
        int[] input = {1,2,0,3,4,0,5};
        //when execute
        int result = FaultOne.numZero(input);
        //then validate/check
        Assert.assertEquals(2,result);
    }

    @Test
    public void testThreeZeros(){
        Assert.assertEquals(3,FaultOne.numZero(new int[]{1,2,0,3,4,0,0}));
    }

    @Test
    public void testNoZeros(){
        //given setup
        int[] input = {1,2,4,3,4,6,5};
        //when execute
        int result = FaultOne.numZero(input);
        //then validate/check
        Assert.assertEquals(0,result);
    }

    @Test
    public void testEmptyArray(){
        //given setup
        int[] input = {};
        //when execute
        int result = FaultOne.numZero(input);
        //then validate/check
        Assert.assertEquals(0,result);
    }

    @Test (expected = NullPointerException.class)
    public void testNull(){
         FaultOne.numZero(null);
    }

    @Test
    public void testOnlyZeros(){
        //given setup
        int[] input = {0,0,0,0,0};
        //when execute
        int result = FaultOne.numZero(input);
        //then validate/check
        Assert.assertEquals(5,result);
    }

}
