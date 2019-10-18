import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Class Timetable ...
 *
 * @author Alex
 * Created on 17.10.2019
 */
public class Timetable {
    Group group;
    List<Subject> subjects;

    /**
     * Constructor Timetable creates a new Timetable instance.
     *
     * @param group of type Group
     */
    Timetable(Group group) {
        this.group = group;
        subjects = new ArrayList<>();
    }

    /**
     * Method setSubjects sets the subjects of this Timetable object.
     *
     *
     *
     * @param subs the subjects of this Timetable object.
     *
     */
    void setSubjects(List<Subject> subs) {
        subjects.clear();
        subjects = subs;
    }

    /**
     * Method addSubject ...
     *
     * @param subject of type Subject
     */
    void addSubject(Subject subject) {
        subjects.add(subject);
        Collections.sort(subjects, new Comparator<Subject>() {
            @Override
            public int compare(Subject o1, Subject o2) {
                if (o1.getDayOfWeek().equals(o2.getDayOfWeek()))
                    return o1.getTime().compareTo(o2.getTime());
                return o1.getNumDay() - o2.getNumDay();
            }
        });
    }

    /**
     * Method getTimetableByDay ...
     *
     * @param day of type String
     * @return List<Subject>
     */
    List<Subject> getTimetableByDay(String day) {
        String dayOfWeek = day.toLowerCase();
        List<Subject> timetable = new ArrayList<>();

        for (Subject sub: subjects) {
            if (dayOfWeek.equals(sub.getDayOfWeek())) {
               timetable.add(sub);
            }
        }
        return timetable;
    }

    /**
     * Method getTimetableByName ...
     *
     * @param name of type String
     * @return List<Subject>
     */
    List<Subject> getTimetableByName(String name) {
        List<Subject> timetable = new ArrayList<>();
        name = name.toLowerCase();
        for (Subject sub: subjects) {
            if (name.equals(sub.getName())) {

                timetable.add(sub);
            }
        }
        if (timetable.isEmpty())
            return null;
        return timetable;
    }


    /**
     * Method getAllTimetable returns the allTimetable of this Timetable object.
     *
     *
     *
     * @return the allTimetable (type List<Subject>) of this Timetable object.
     */
    List<Subject> getAllTimetable() {
        return subjects;
    }

    /**
     * Method removeDay ...
     *
     * @param day of type String
     */
    void removeDay(String day) {
        List<Subject> newSubjects = new ArrayList<>();
        String dayOfWeek = day.toLowerCase();

        for (Subject sub: subjects) {
            if (!dayOfWeek.equals(sub.getDayOfWeek())) {
               newSubjects.add(sub);
            }
        }
        setSubjects(newSubjects);
    }

    Group getGroup() {
        return group;
    }

    double getTimePerWeek() {
        return 1.5 * subjects.size();
    }
}