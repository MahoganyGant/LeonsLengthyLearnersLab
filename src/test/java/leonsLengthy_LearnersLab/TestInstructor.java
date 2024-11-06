package leonsLengthy_LearnersLab;

    import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class TestInstructor {

        @Test
        public void testImplementation() {
            Instructor instructor = new Instructor(1L, "Mr. Smith");
            assertTrue(instructor instanceof Teacher);
        }

        @Test
        public void testInheritance() {
            Instructor instructor = new Instructor(1L, "Mr. Smith");
            assertTrue(instructor instanceof Person);
        }

        @Test
        public void testTeach() {
            Instructor instructor = new Instructor(1L, "Mr. Smith");
            Student student = new Student(2L, "Alice");
            instructor.teach(student, 5);
            assertEquals(5, student.getTotalStudyTime());
        }

        @Test
        public void testLecture() {
            Instructor instructor = new Instructor(1L, "Mr. Smith");
            Student student1 = new Student(2L, "Alice");
            Student student2 = new Student(3L, "Bob");
            Learner[] learners = {student1, student2};
            instructor.lecture(learners, 10);
            assertEquals(5, student1.getTotalStudyTime());
            assertEquals(5, student2.getTotalStudyTime());
        }
    }
