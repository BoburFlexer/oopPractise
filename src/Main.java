public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("white", "Pitbul",4);
        Dog dog = new Dog("Good dog, dont bite", "Black", 2,"Zvonok");
        Fish fish = new Fish("Bite, dont like people", "Blue", 122, "200 Kilogramm");
        Bird bird = new Bird("White", 1, 99, "Cant speak");
        System.out.println(cat);
        System.out.println(" ");
        System.out.println(dog);
        System.out.println(" ");
        System.out.println(fish);
        System.out.println(" ");
        System.out.println(bird);
    }
}