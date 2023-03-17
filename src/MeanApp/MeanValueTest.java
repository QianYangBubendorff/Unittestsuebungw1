package MeanApp;

import org.junit.Assert;
import org.junit.Test;

public class MeanValueTest {
    @Test
    public void testSumTwoPositiveEvenNumbersReturnAveragePositive(){
        // setup
        MeanValue meanValue = new MeanValue();
        int result = meanValue.mean(2,4);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testTheMeanOfTwoPositiveOddNumbersReturnAveragePositive(){
        // setup
        MeanValue meanValue = new MeanValue();
        int result = meanValue.mean(1,7);
        Assert.assertEquals(4, result);
    }

    @Test
    public void testOddAndEvenNumbersAdditionResultReturnRoundDown( ){
        // setup
        MeanValue meanValue = new MeanValue();
        int result = meanValue.mean(2,3);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testTheMeanOfTwoNegativeValuesReturnAverageNegative(){
        // setup
        MeanValue meanValue = new MeanValue();
        int result = meanValue.mean(-2,-4);
        Assert.assertEquals(-3, result);
    }

    @Test
    public void testAdditionIsDecimalValueBetween0And1Return0(){
        // setup
        MeanValue meanValue = new MeanValue();
        int result = meanValue.mean(-2,3);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testAdditionIs0Return0(){
        // setup
        MeanValue meanValue = new MeanValue();
        int result = meanValue.mean(-2,2);
        Assert.assertEquals(0, result);
    }



}
