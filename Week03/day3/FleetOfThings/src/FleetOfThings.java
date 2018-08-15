public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch
        fleet.add(new Thing("Get milk"));
        fleet.add(new Thing("Remove the obstacles"));
        Thing thing1 = new Thing("Stand up");
        thing1.complete();
        fleet.add(thing1);
        Thing thing2 = new Thing("Eat lunch");
        thing2.complete();
        fleet.add(thing2);
        System.out.println(fleet);
    }
}