public class Main {
    public static void main(String[] args) {
        // Create a new console
        Console c = new Console();

        // Initialize a new school
        School hz = new School("Hogeschool Zeeland");
//        System.out.println("Welkom op de " + hz.getName());
        c.log("Het is nu 6 uur");

        // Initialize new students
        Student student1 = new Student("Wouter Martens", "CIN");
        Student student2 = new Student("Leon de Kraker", "CIN");

        // Fill an array with all of the students
        Student[] students = {student1, student2};
        c.log("Er zijn " + students.length + " studenten. Dit zijn:");

        for (Student student: students) {
            c.log(student.getName());
        }

        // Print all of the students
//        for (Student student: students) {
//            student.print();
//        }

        // Add students to the school
        hz.addStudents(students);
//        hz.print();
    }
}
