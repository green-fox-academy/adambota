public class Main {

    public static void main(String[] args) {
        int dailyHours = 6;
        int semesterWeeks = 17;
        System.out.println("Average hours in a semester: " + (dailyHours*semesterWeeks*5));
        int averageWeeklyHours = 52;
        System.out.println("Percentage: " + (double)(dailyHours*semesterWeeks*5)/averageWeeklyHours);
    }
}
