package rpg_tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;

public class DummyTest {

    private Axe axe;
    private Dummy dummy;

    @Before
    public void enitializeObjects(){
        axe = new Axe(10, 10);
        dummy = new Dummy(10, 10);
    }

    @Test
    public void dummyLosesHealthIfAttacked(){

        this.axe.attack(this.dummy);
        Assert.assertEquals(0, dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void dummyThrowsExceptionIfAttacked(){
        Dummy dummy = new Dummy(0, 10);
        this.axe.attack(dummy);
    }

    @Test
    public void deadDummyCanGiveXP(){
        Dummy dummy = new Dummy(0, 10);
        dummy.giveExperience();

        Assert.assertEquals(10,dummy.giveExperience());
    }


    @Test(expected = IllegalStateException.class)
    public void aliveDummyCantGiveXp(){
        this.dummy.giveExperience();
    }


}
