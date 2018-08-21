class Student extends Person {
    private String previousOrganization;
    private int skippedDays;

    void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    void introduce() {
        System.out.println("Hi, I'm " + name + " , a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    void skipDays(int numberOfDays) {
        this.skippedDays += numberOfDays;
    }

    Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    Student() {
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }
}
