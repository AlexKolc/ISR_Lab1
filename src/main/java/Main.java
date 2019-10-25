public class Main {
    public static void main(String[] args) {
        Group group = new Group("M3304");
        Timetable timetable = new Timetable(group);

        timetable.addSubject(new Subject(Subject.Day.MONDAY.name(), "13.30", "Economics", "Lection", "Ivan"));
        timetable.addSubject(new Subject("tuEsday", "15.00", "Math", "practice", "Sveta"));
        timetable.addSubject(new Subject("sunday", "13.30", "Economics", "practice", "Ruslan"));
        timetable.addSubject(new Subject("monday", "10.00", "SAKF", "Lection", "Ivan"));
        timetable.addSubject(new Subject("tuesday", "17.30", "asdd", "Lection", "Ivan"));
        
        //System.out.println(timetable.getAllTimetable());
        System.out.println(timetable.getTimetableByName("Economics"));

        System.out.println("Hello world?!");

        System.out.println("we need help");

    }
}