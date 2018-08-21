class Mentor extends Person {
    private String level;

    void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }

    void introduce() {
        System.out.println("Hi, I'm " + name + " , a " + age + " year old " + gender + " " + level + " mentor.");
    }

    Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    Mentor() {
        this.level = "intermediate";
    }
}
