import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Profession;
import pojo.Student;

import java.util.List;

public class App {

    private static List<Student> students;

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) applicationContext.getBean("app");

        printStudentsByGroupId();
        printStudentsByGroupAndRating();
        doProfessional();
    }

    public static void printStudentsByGroupId() {
        students.stream()
                .filter(student -> student.getGroup().getId() == 2)
                .forEach(System.out::println);
    }

    public static void printStudentsByGroupAndRating() {
        students.stream()
                .filter(student -> student.getGroup().getId() == 1 & student.getAvgRating() > 50)
                .forEach(System.out::println);
    }

    public static void doProfessional() {
        students.stream()
                .filter(student -> student.getAvgRating() > 80)
                .map(Profession::new)
                .forEach(System.out::println);
    }

    public void setStudents(List<Student> students) {
        App.students = students;
    }
}
