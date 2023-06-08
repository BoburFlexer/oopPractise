public class Bird {
    String color;
    int age;
    int cost;
    String couldSpeak;

    public Bird(String color, int age, int cost, String couldSpeak) {
        this.color = color;
        this.age = age;
        this.cost = cost;
        this.couldSpeak = couldSpeak;
    }

    public Bird() {
    }

    @Override
    public String toString() {
        return "Bird:" +
                "color=" + color + "\n" +
                "age=" + age + "\n" +
                "cost=" + cost +"\n"+
                "couldSpeak=" + couldSpeak;
    }
}
