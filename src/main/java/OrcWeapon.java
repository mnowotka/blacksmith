import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrcWeapon implements Weapon {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrcWeapon.class);
    public OrcWeapon(WeaponType weaponType){
        LOGGER.info("OrcWeapon created!");
    }
}
