public class Course {
    String name;
    int number;
    String nameOfTeacher;
    String beginning;

    public Course(String name, int number, String nameOfTeacher, String beginning) {
        this.name = name;
        this.number = number;
        this.nameOfTeacher = nameOfTeacher;
        this.beginning = beginning;
    }

    public Course() {

    }

    @Override
    public String toString() {
        return "Course:" +
                "name=" + name + "\n" +
                "number=" + number +
                "nameOfTeacher=" + nameOfTeacher + "\n" +
                "beginning=" + beginning;
    }
}
