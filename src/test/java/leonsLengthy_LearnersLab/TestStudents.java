package leonsLengthy_LearnersLab;

    import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class TestStudents {

        @Test
        public void testSingleton() {
            Students students = Students.getInstance();
            assertNotNull(students.findById(1L));  // Assuming "lisa" has ID 1
            assertNotNull(students.findById(2L));  // Assuming "Bobby" has ID 2
        }
    }

