public class Page {
    private Student student;

    public Page(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        //System.out.println("Ik ben " + name + " (" + id + ") en mijn favoriete course is " + course + ".");
        return "Ik ben " + this.student.getName() + " (" + this.student.getId() + ") en mijn favoriete course is " + this.student.getCourse() + ".";
    }
}
