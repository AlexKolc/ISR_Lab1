import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class Tests {
    @Test
    public void getAllTimetable() {
        Group group = new Group("M3304");
        Timetable timetable = new Timetable(group);

        Subject sub1 = new Subject("monday", "13.30", "Economics", "Lection", "Ivan");
        Subject sub2 = new Subject("tuEsday", "15.00", "Math", "practice", "Sveta");
        Subject sub3 = new Subject("sunday", "13.30", "Economics", "practice", "Ruslan");
        Subject sub4 = new Subject("monday", "10.00", "Programming", "Lection", "Ivan");
        Subject sub5 = new Subject("tuesday", "17.30", "Math", "Lection", "Ivan");

        timetable.addSubject(sub1);
        timetable.addSubject(sub2);
        timetable.addSubject(sub3);
        timetable.addSubject(sub4);
        timetable.addSubject(sub5);
        List<Subject> expected = timetable.getAllTimetable();

        List<Subject> actual = new ArrayList<>();
        actual.add(sub4);
        actual.add(sub1);
        actual.add(sub2);
        actual.add(sub5);
        actual.add(sub3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTimetableByDay() {
        Group group = new Group("M3304");
        Timetable timetable = new Timetable(group);

        Subject sub1 = new Subject("monday", "13.30", "Economics", "Lection", "Ivan");
        Subject sub2 = new Subject("tuEsday", "15.00", "Math", "practice", "Sveta");
        Subject sub3 = new Subject("sunday", "13.30", "Economics", "practice", "Ruslan");
        Subject sub4 = new Subject("monday", "10.00", "Programming", "Lection", "Ivan");
        Subject sub5 = new Subject("tuesday", "17.30", "Math", "Lection", "Ivan");

        timetable.addSubject(sub1);
        timetable.addSubject(sub2);
        timetable.addSubject(sub3);
        timetable.addSubject(sub4);
        timetable.addSubject(sub5);
        List<Subject> expected = timetable.getTimetableByDay("MonDay");

        List<Subject> actual = new ArrayList<>();
        actual.add(sub4);
        actual.add(sub1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDay() {
        Group group = new Group("M3304");
        Timetable timetable = new Timetable(group);

        Subject sub1 = new Subject("monday", "13.30", "Economics", "Lection", "Ivan");
        Subject sub2 = new Subject("tuEsday", "15.00", "Math", "practice", "Sveta");
        Subject sub3 = new Subject("sunday", "13.30", "Economics", "practice", "Ruslan");
        Subject sub4 = new Subject("monday", "10.00", "Programming", "Lection", "Ivan");
        Subject sub5 = new Subject("tuesday", "17.30", "Math", "Lection", "Ivan");

        timetable.addSubject(sub1);
        timetable.addSubject(sub2);
        timetable.addSubject(sub3);
        timetable.addSubject(sub4);
        timetable.addSubject(sub5);
        timetable.removeDay("tUEsday");
        List<Subject> expected = timetable.getAllTimetable();

        List<Subject> actual = new ArrayList<>();
        actual.add(sub4);
        actual.add(sub1);
        actual.add(sub3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
