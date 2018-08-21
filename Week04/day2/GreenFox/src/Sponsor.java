public class Sponsor extends Person {
    String company;
    int hiredStudents;

    public void introduce() {
        System.out.println("Hi, I'm " + name + " , a " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " so far.");
    }

    public void hire() {
        this.hiredStudents++;
    }

    public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers");
    }

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
    }

    public Sponsor() {
        this.company = "Google";
        this.hiredStudents = 0;
    }
}