package rpg_tests;

import Interfaces.Target;
import Interfaces.Weapon;
import org.junit.Assert;
import org.junit.Test;
import rpg_lab.Hero;

public class HeroTest {
    public static final int TARGET_XP = 10;


    @Test
    public void attackGainsExperianceIfTargetIsDead(){
        Target fakeTarget = new Target() {
            public int getHealth() {
                return 0;
            }

            public void takeAttack(int attackPoints) {

            }

            public int giveExperience() {
                return TARGET_XP;
            }

            public boolean isDead() {
                return true;
            }
        };

        Weapon fakeWeapon = new Weapon() {
            public int getAttackPoints() {
                return 10;
            }

            public int getDurabilityPoints() {
                return 0;
            }

            public void attack(Target target) {

            }
        };

        Hero hero = new Hero("hero",fakeWeapon);
        hero.attack(fakeTarget);
        Assert.assertEquals("Wrong experience", TARGET_XP, hero.getExperience());

    }

}
