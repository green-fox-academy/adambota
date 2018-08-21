public class Main {
    public static void main(String[] args) {
        Carrier carrier = new Carrier(500, 1500);
        carrier.add(new F16());
        carrier.add(new F35());
        System.out.println(carrier.getStatus());
        carrier.fill();
        System.out.println();
        System.out.println(carrier.getStatus());

        Carrier carrier2 = new Carrier(100, 1000);
        carrier.fight(carrier2);
        System.out.println(carrier.getStatus());
        System.out.println();
        System.out.println(carrier2.getStatus());
        carrier.fill();
        carrier.fight(carrier2);
        System.out.println(carrier2.getStatus());
    }
}
