public class Student {
    private static int count = 0;
    private int id = 0;
    private String name;
    private String course;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
        this.id = count++;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getCourse() {
        return this.course;
    }

    public String print() {
        return "Ik ben " + this.name + " (" + this.id + ") en mijn favoriete course is " + this.course + ".";
    }
}

