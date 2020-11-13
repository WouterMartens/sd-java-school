public class StudentCard {
    private Student student;

    public StudentCard(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Studentnummer: " + this.student.getId() + ", naam: " + this.student.getName();
    }
}
