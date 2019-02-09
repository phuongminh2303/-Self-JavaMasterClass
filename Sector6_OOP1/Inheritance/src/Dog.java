public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // default inheritance
    //public Dog(String name, int body, int size, int weight) {
    //    super(name, body, size, weight);
    //}

    //more than this:
    public Dog(String name, int size,  int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size,weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    // function of dog
    public void chew(){
        System.out.println("Dog.chew() called");
    }

    // override eat() from animal, add more characteristic of a dog
    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog.eat() called");
        chew();
    }
}
