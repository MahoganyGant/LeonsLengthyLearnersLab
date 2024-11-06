package leonsLengthy_LearnersLab;

    public final class Students extends People {
        private static final Students INSTANCE = new Students();

        private Students() {
            add(new Student(1L, "Alice"));
            add(new Student(2L, "Bob"));
            // Add other students as needed
        }

        public static Students getInstance() {
            return INSTANCE;
        }
    }

