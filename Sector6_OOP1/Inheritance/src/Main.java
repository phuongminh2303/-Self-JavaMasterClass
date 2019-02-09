public class Main {
    public static void main(String[] args) {
        Animal duck = new Animal("Donald", 1, 1, 5, 5);
        duck.eat();

        System.out.println("\n");
        Dog dog = new Dog("Hat", 8, 28, 2, 4, 1, 20, "Long Black");
        dog.eat();
    }
}
