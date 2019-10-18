import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class University {
    List<Timetable> timetables;

    University() {
        timetables = new ArrayList<Timetable>();
    }

    void addTimetable(Timetable timetable) {
        timetables.add(timetable);
        Collections.sort(timetables, new Comparator<Timetable>() {
            @Override
            public int compare(Timetable o1, Timetable o2) {
                return o1.getGroup()
                        .getName()
                        .compareTo(o2.getGroup()
                                .getName()
                        );
            }
        });
    }

    Timetable getTimetableByGroup(Group group) {
        for (Timetable tle: timetables) {
            if (tle.getGroup().getName().equals(group.getName()))
                return tle;
        }
        return null;
    }
}
