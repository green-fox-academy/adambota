import java.util.ArrayList;
import java.util.List;

class Cohort {
    String name;
    List<Student> students;
    List<Mentor> mentors;

    void addStudent(Student student) {
        this.students.add(student);
    }

    void addMentor(Mentor mentor) {
        this.mentors.add(mentor);
    }

    void info() {
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors");
    }

    Cohort(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }
}
