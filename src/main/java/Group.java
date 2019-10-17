import java.util.ArrayList;
import java.util.List;

/**
 * Class Group ...
 *
 * @author Alex
 * Created on 17.10.2019
 */
public class Group {
    String name;
    List <String> students;

    /**
     * Constructor Group creates a new Group instance.
     *
     * @param name of type String
     */
    Group(String name) {
        this.name = name;
        this.students = new ArrayList<String>();
    }

    /**
     * Method addStudent ...
     *
     * @param student of type String
     */
    void addStudent(String student) {
        students.add(student);
    }

    /**
     * Method removeStudent ...
     *
     * @param student of type String
     */
    void removeStudent(String student) {
        students.remove(student);
    }

    int countOfStudents() {
        return students.size();
    }

}