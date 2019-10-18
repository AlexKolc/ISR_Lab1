/**
 * Class Subject ...
 *
 * @author Alex
 * Created on 17.10.2019
 */
public class Subject {
    private String[] days = {"monday", "tuesday",
            "wednesday", "thursday", "friday",
            "saturday", "sunday"
    };

    public enum Day{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    private String name;
    private String time;
    private String dayOfWeek;
    private String typeOfLesson;
    private String teacher;

    /**
     * Constructor Subject creates a new Subject instance.
     *
     * @param dayOfWeek of type String
     * @param time of type String
     * @param name of type String
     * @param typeOfLesson of type String
     * @param teacher of type String
     */
    Subject(String dayOfWeek, String time, String name, String typeOfLesson, String teacher) {
        this.dayOfWeek = dayOfWeek.toLowerCase();
        this.time = time;
        this.name = name.toLowerCase();
        this.typeOfLesson = typeOfLesson.toLowerCase();
        this.teacher = teacher;
    }

    /**
     * Method getName returns the name of this Subject object.
     *
     *
     *
     * @return the name (type String) of this Subject object.
     */
    String getName() {
        return name;
    }

    /**
     * Method getTime returns the time of this Subject object.
     *
     *
     *
     * @return the time (type String) of this Subject object.
     */
    String getTime() {
        return time;
    }

    /**
     * Method getDayOfWeek returns the dayOfWeek of this Subject object.
     *
     *
     *
     * @return the dayOfWeek (type String) of this Subject object.
     */
    String getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Method getTypeOfLesson returns the typeOfLesson of this Subject object.
     *
     *
     *
     * @return the typeOfLesson (type String) of this Subject object.
     */
    String getTypeOfLesson() {
        return typeOfLesson;
    }

    /**
     * Method getTeacher returns the teacher of this Subject object.
     *
     *
     *
     * @return the teacher (type String) of this Subject object.
     */
    String getTeacher() {
        return teacher;
    }

    /**
     * Method getNumDay returns the numDay of this Subject object.
     *
     *
     *
     * @return the numDay (type int) of this Subject object.
     */
    int getNumDay() {
        int index = 0;
        for (int i = 0; i < 7; i++)
            if (days[i].equals(dayOfWeek)) {
                index = i;
            }
        return index;
    }

    /**
     * Method toString ...
     * @return String
     */
    @Override
    public String toString() {
        String subject = "";
        subject += "\t";
        subject += dayOfWeek + "\t";
        subject += time + "\t";
        subject += name + "\t";
        subject += typeOfLesson + "\t";
        subject += teacher + "\n";
        return subject;
    }


}