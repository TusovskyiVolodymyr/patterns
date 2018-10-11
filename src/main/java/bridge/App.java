package bridge;

public class App {
    public static void main(String[] args) {
        Warrior warrior = new RegularSolder("John");
        warrior.setWeapon(new Rifle());
        warrior.fight();
        warrior.setWeapon(new MachineGun());
        warrior.fight();
    }
}
