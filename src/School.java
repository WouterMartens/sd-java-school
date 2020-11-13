import java.util.Vector;

public class School {
    private String name;
    private Vector students;

    public School(String name) {
        this.name = name;
        this.students = new Vector();
    }

    public void addStudents(Student[] newStudents) {
       for (Student student: newStudents) {
           students.addElement(student);
       }
    }

    public String getName() {
        return name;
    }

    public void print() {

    }
}
