import java.util.*;

public class Reservation implements Reservationy {
    private String dowBooking;
    private String codeBooking;

    public Reservation() {
        this.dowBooking = generateDow();
        this.codeBooking = generateCode();
    }

    @Override
    public String getDowBooking() {
        return dowBooking;
    }

    @Override
    public String getCodeBooking() {
        return codeBooking;
    }

    private String generateDow() {
        Random rnd = new Random();
        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        return days[rnd.nextInt(7)];
    }

    private String generateCode() {
        Random rnd = new Random();
        String code = "";
        String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < 8; i++) {
            code += characters.charAt(rnd.nextInt(characters.length()));
        }
        return code;
    }

    void printReservation() {
        System.out.println("Booking# " + getCodeBooking() + " for " + getDowBooking());
    }
}
