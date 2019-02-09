public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("rex", 3); // create instance (rex)
        Dog fluffy = new Dog("fluffy",5); // create instance (fluffy)

        fluffy.printNameAndAge();     // print "fluffy"
        rex.printNameAndAge();        // print "fluffy" too, because name is
                                // STATIC variable

    }
}


class Dog{
    private static String name;
    private int age;

    public Dog(String name , int age){
        Dog.name = name; // static variable must be accessed like this
        this.age = age;  // instance variable
    }

    public void printNameAndAge(){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}

