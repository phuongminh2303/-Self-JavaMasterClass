public class Constructors2 {
    public static void main(String[] args) {
        vipCustomer person1 = new vipCustomer(); // no parameter
        System.out.println(person1.getName());

        vipCustomer person2 = new vipCustomer("James", 200); // 2 parameters, one is default
        System.out.println(person2.getName());

        vipCustomer person3 = new vipCustomer("Alice", 300, "alice@gmail.com"); // 3 parameters
        System.out.println(person3.getName());
    }


}

class vipCustomer {
    private String name;
    private double credit;
    private String email;

    //constructor 1:

    public vipCustomer() {
        this("PhuongMinh", 5000, "phuongdnm@gmail.com");
    }

    //constructor 2:
    public vipCustomer(String name, double credit) {
        this(name, credit, "phuongminh2303@gmail.com");
    }

    // constructor 3:
    public vipCustomer(String name, double credit, String email) {
        this.name = name;
        this.credit = credit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCredit() {
        return credit;
    }

    public String getEmail() {
        return email;
    }
}
