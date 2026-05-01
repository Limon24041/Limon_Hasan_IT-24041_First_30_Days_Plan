import java.util.ArrayList;

public class CourseList {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();

        courses.add("Operating System");
        courses.add("Object Oriented Pattern and Design");
        courses.add("Communication Engineering");
        courses.add("Microprocessor and Embedded System");

        System.out.println(courses.get(0));
        System.out.println(courses);
    }
}
