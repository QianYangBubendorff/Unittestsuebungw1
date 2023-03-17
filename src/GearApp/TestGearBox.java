package GearApp;

import org.junit.Assert;
import org.junit.Test;

public class TestGearBox {

    @Test
    public void testShiftUpWhenHIghRPM(){
        // setup
        GearBox gearBox = new GearBox();
        gearBox.gear = 3;

        // execute
        gearBox.shiftGear(2500);

        // validate/test
        Assert.assertEquals(4, gearBox.gear);
    }
    @Test
    public void testShiftDownWhenLowRPM(){
        // setup
        GearBox gearBox = new GearBox();
        gearBox.gear = 3;

        // execute
        gearBox.shiftGear(400);

        // validate/test
        Assert.assertEquals(2, gearBox.gear);
    }
    @Test
    public void testNoShiftDownInGearOne(){
        // setup
        GearBox gearBox = new GearBox();
        gearBox.gear = 1;

        // execute
        gearBox.shiftGear(400);

        // validate/test
        Assert.assertEquals(1, gearBox.gear);
    }
    @Test
    public void testNoShiftUpInGearSix(){
        // setup
        GearBox gearBox = new GearBox();
        gearBox.gear = 6;

        // execute
        gearBox.shiftGear(3000);

        // validate/test
        Assert.assertEquals(6, gearBox.gear);
    }

    @Test
    public void testRemainInNeutral(){
        GearBox gearBox = new GearBox();
        gearBox.gear = 0;
        gearBox.shiftGear(2500);
        Assert.assertEquals(0, gearBox.gear);
    }
    @Test
    public void testRemainInCurrentGear(){
        GearBox gearBox = new GearBox();
        gearBox.gear = 4;
        gearBox.shiftGear(1500);
        Assert.assertEquals(4, gearBox.gear);
    }

}
