public class Student {
    String birhday;
    String name;
    int age;
    public Student(String birhday, String name, int age){
        this.birhday = birhday;
        this.name = name;
        this.age = age;
        if (age<0){
            System.out.println("Терс жаш?");
        }
    }
    public Student() {
    }

    @Override
    public String toString() {
        return "Student:" +
                "birhday=" + birhday + "\n" +
                "name=" + name + "\n" +
                "age=" + age;
    }
}
//        Course course = new Course("English", 101 , "Joe Jones", "13 March");
//        Student student = new Student("14.09.1995", "Saul Canelo Alvarez", 38);
//        System.out.println(course);
//        System.out.println(" ");
//        System.out.println(" ");
//        System.out.println(student);