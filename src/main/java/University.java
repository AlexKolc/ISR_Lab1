import java.util.ArrayList;
import java.util.List;

public class University {
    List<Timetable> timetables;

    University() {
        timetables = new ArrayList<Timetable>();
    }

    void addTimetable(Timetable timetable) {
        timetables.add(timetable);
    }

    Timetable getTimetableByGroup(Group group) {
        for (Timetable tle: timetables) {
            if (tle.getGroup().getName().equals(group.getName()))
                return tle;
        }
        return null;
    }
}
