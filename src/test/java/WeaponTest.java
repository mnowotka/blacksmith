import junit.framework.TestCase;

public class WeaponTest extends TestCase {

    public void testFactory(){
        WeaponFactory elfFactory = new WeaponFactory(new ElfBlacksmith());
        Weapon elfSward = elfFactory.buildWeapon(WeaponType.SWORD);
        WeaponFactory orcFactory = new WeaponFactory(new OrcBlacksmith());
        Weapon orcSward = orcFactory.buildWeapon(WeaponType.SWORD);
    }

}
