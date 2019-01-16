package rpg_tests;

import org.junit.Assert;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;

public class AxeTest {

    @Test
    public void weponAttacksLosesDurability(){
        Axe axe = new Axe(10,10);
        Dummy dummy = new Dummy(20,20);

        axe.attack(dummy);
        Assert.assertEquals(9,axe.getDurabilityPoints());
    }

    @Test
    public void attackDummyLosesHealth(){
        Axe axe = new Axe(10,10);
        Dummy dummy = new Dummy(20,20);

        axe.attack(dummy);

        Assert.assertEquals(10,dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void attackWithZeroDurability(){
        Axe axe = new Axe(10,0);
        Dummy dummy = new Dummy(20,20);

        axe.attack(dummy);

    }


}
