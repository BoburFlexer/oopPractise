public class Cat {
    String color;
    String breed;
    int age;

    public Cat(String color, String breed, int age) {
        this.color = color;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat:" +
                "color=" + color + "\n" +
                "breed=" + breed + "\n" +
                "age=" + age;
    }

    public Cat() {
    }
}
