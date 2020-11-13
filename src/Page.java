public class Page {
    private Student student;

    public Page(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Ik ben " + this.student.getName() + " (" + this.student.getId() + ") en mijn favoriete course is " + this.student.getCourse() + ".";
    }
}
