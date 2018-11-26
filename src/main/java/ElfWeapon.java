import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElfWeapon implements Weapon {
    private static final Logger LOGGER = LoggerFactory.getLogger(ElfWeapon.class);
    public ElfWeapon(WeaponType weaponType){
        LOGGER.info("ElfWeapon created!");
    }
}
