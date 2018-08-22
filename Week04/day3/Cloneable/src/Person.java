class Person {
    String name;
    int age;
    String gender;

    void introduce() {
        System.out.println("Hi, I'm " + name + " , a " + age + " year old " + gender);
    }

    void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }
}
