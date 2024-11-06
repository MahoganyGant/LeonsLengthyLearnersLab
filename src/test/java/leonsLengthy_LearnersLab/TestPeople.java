package leonsLengthy_LearnersLab;

    import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class TestPeople {

        @Test
        public void testAdd() {
            People people = new People();
            Person person = new Person(1L, "Alice");
            people.add(person);
            assertTrue(people.contains(person));
        }

        @Test
        public void testRemove() {
            People people = new People();
            Person person = new Person(1L, "Alice");
            people.add(person);
            people.remove(person);
            assertFalse(people.contains(person));
        }

        @Test
        public void testFindById() {
            People people = new People();
            Person person = new Person(1L, "Alice");
            people.add(person);
            assertEquals(person, people.findById(1L));
        }
    }

