public class WeaponFactory {
    private Blacksmith blacksmith;

    public WeaponFactory(Blacksmith blacksmith){
        this.blacksmith = blacksmith;
    }

    public Weapon buildWeapon(WeaponType weaponType){
        return blacksmith.manufactureWeapon(weaponType);
    }

}
