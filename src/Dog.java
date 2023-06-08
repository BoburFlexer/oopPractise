public class Dog {
    String attitude;
    String color;
    int age;
    String breed;

    public Dog(String attitude, String color, int age, String breed) {
        this.attitude = attitude;
        this.color = color;
        this.age = age;
        this.breed = breed;
    }

    public Dog() {

    }

    @Override
    public String toString() {
        return "Dog:" +
                "attitude=" + attitude + "\n" +
                "color=" + color + "\n" +
                "age=" + age +
                "breed=" + breed + "\n";
    }
}
