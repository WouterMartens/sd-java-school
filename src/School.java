import java.util.ArrayList;

public class School {
    private String name;
    private ArrayList<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<Student>();
    }

    public String getName() {
        return name;
    }

    public void entrance(Student student) {
        this.students.add(student);
    }

    public String getStudentPasses() {
        StringBuilder builder = new StringBuilder();

        for (Student student: this.students) {
            StudentCard card = new StudentCard(student);
            String msg = card.toString();
            builder.append(msg);
            builder.append(System.lineSeparator());
        }

        return builder.toString();
    }
}
