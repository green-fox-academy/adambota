public class BattleApp {
    public static void main(String[] args) {

        Ship ship1 = new Ship();
        Ship ship2 = new Ship();
        ship1.fillShip();
        ship2.fillShip();
        System.out.println(ship1.battle(ship2));
        ship1.printInfo();
        ship2.printInfo();

    }
}
