package leonsLengthy_LearnersLab;

    import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class TestStudent {

        @Test
        public void testImplementation() {
            Student student = new Student(1L, "Alice");
            assertTrue(student instanceof Learner);
        }

        @Test
        public void testInheritance() {
            Student student = new Student(1L, "Alice");
            assertTrue(student instanceof Person);
        }

        @Test
        public void testLearn() {
            Student student = new Student(1L, "Alice");
            student.learn(5);
            assertEquals(5, student.getTotalStudyTime());
        }
    }
}
