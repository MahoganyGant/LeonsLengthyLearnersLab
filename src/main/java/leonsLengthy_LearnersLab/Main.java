package leonsLengthy_LearnersLab;

public class Main {
    public static void main(String[] args) {
        //Test Person Class
        Person person = new Person(1L, "lisa");
        System.out.println("Person ID: " + person.getId());
        System.out.println("Person Name: " + person.getName());

        //Test Student Class
        Student student = new Student(2L, "Bobby");
        System.out.println("\nStudent ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());

        // Student learns for a few hours
        student.learn(5);
        System.out.println("Student Total Study Time after learning 5 hours: " + student.getTotalStudyTime());

        //Test Instructor Class
        Instructor instructor = new Instructor(3L, "Dr. John");

        // Instructor teaches a student(bobby)
        instructor.teach(student, 3);
        System.out.println("Student Total Study Time after instructor teaches 3 hours: " + student.getTotalStudyTime());

        // Instructor gives a lecture to multiple students
        Student student1 = new Student(4L, "Charlie");
        Student student2 = new Student(5L, "Dianna");
        Learner[] learners = {student, student1, student2};
        instructor.lecture(learners, 9);
        System.out.println("Student Total Study Time after lecture of 9 hours distributed among 3 students:");
        System.out.println("Student (Bobby) Total Study Time: " + student.getTotalStudyTime());
        System.out.println("Student (Charlie) Total Study Time: " + student1.getTotalStudyTime());
        System.out.println("Student (Dianna) Total Study Time: " + student2.getTotalStudyTime());

        //Test People Class
        People people = new People();
        people.add(person);
        people.add(student);
        people.add(instructor);
    }
}
