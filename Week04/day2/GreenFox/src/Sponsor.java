class Sponsor extends Person {
    private String company;
    private int hiredStudents;

    public void introduce() {
        System.out.println("Hi, I'm " + name + " , a " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " so far.");
    }

    void hire() {
        this.hiredStudents++;
    }

    void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers");
    }

    Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
    }

    Sponsor() {
        this.company = "Google";
        this.hiredStudents = 0;
    }
}