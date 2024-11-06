package leonsLengthy_LearnersLab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPerson {

        @Test
        public void testConstructor() {
            Person person = new Person(1L, "Alice");
            assertEquals(1L, person.getId());
            assertEquals("Alice", person.getName());
        }

        @Test
        public void testSetName() {
            Person person = new Person(1L, "Alice");
            person.setName("Bob");
            assertEquals("Bob", person.getName());
        }
    }

