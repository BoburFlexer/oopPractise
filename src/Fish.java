public class Fish {
    String attitude;
    String color;
    int age;
    String weight;

    public Fish(String attitude, String color, int age, String weight) {
        this.attitude = attitude;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public Fish() {

    }

    @Override
    public String toString() {
        return "Fish:" +
                "attitude=" + attitude + '\'' +
                "color=" + color + "\n" +
                "age=" + age +
                "weight=" + weight + "\n";
    }
}