public class Main {
    static void printCourseLastLetter(Professor[] professors) {
        for (Professor professor : professors) {
            String course = professor.getCourse();
            int lastLetterIndex = course.length() - 1;
            System.out.println(course.charAt(lastLetterIndex));
        }
    }

    public static void main(String[] args) {
        Professor[] array = new Professor[] {
                new Professor("Gianni", (byte) 0, "java"),
                new Professor("andrea", (byte) 5, "C++"),
                new Professor("fabio", (byte) 10, "mathematics")
        };
        printCourseLastLetter(array);

        for (Professor professor : array) {
            if (professor.getCourse().length() > 10) {
                System.out.println(professor.getName());
            }
        }
    }
}
