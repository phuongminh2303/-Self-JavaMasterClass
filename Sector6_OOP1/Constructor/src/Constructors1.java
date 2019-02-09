import java.util.Scanner;

public class Constructors1 {
    public static void main(String[] args) {
        bankAccount account = new bankAccount();
        Scanner in = new Scanner(System.in);

        // ask input
        System.out.println("Enter your card number: ");
        int number = in.nextInt();
        System.out.println("Enter your balance: ");
        int balance = in.nextInt();

        in.nextLine();
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Enter your email: ");
        String email = in.nextLine();
        System.out.println("Enter your phone number: ");
        String phone = in.nextLine();

        //set value to account object
        account.setNum(number);
        account.setBalance(balance);
        account.setCustomerName(name);
        account.setEmail(email);
        account.setPhone(phone);

        int option = 0, money;
        while (option != -1) {
            System.out.println("\n\n1. Display account information.");
            System.out.println("2. Deposit.");
            System.out.println("3. Withdraw.");
            System.out.println("\tYour option: ");
            option = in.nextInt();
            switch (option) {
                case 1:
                    account.getInfor();
                    break;
                case 2:
                    System.out.println("Enter your money: ");
                    money = in.nextInt();
                    account.depositFund(money);
                    break;
                case 3:
                    System.out.println("Enter your money: ");
                    money = in.nextInt();
                    account.withdrawFund(money);
                    break;
            }
        }

    }
}

class bankAccount {
    private int number;
    private int balance;
    private String customerName;
    private String email;
    private String phone;

    public void setNum(int number) {
        this.number = number;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void getInfor() {
        System.out.println("Account number : " + this.number);
        System.out.println("Balance        : " + this.balance);
        System.out.println("Customer name  : " + this.customerName);
        System.out.println("Email          : " + this.email);
        System.out.println("Phone          : " + this.phone);
    }

    public void depositFund(int balance) {
        this.balance += balance;
        System.out.println("Your balance now: " + this.balance);
    }

    public void withdrawFund(int balance) {
        if (balance > this.balance)
            System.out.println("You don't have enough money in your account");
        else {
            System.out.println("Withdraw: " + balance);
            this.balance -= balance;
            System.out.println("Your balance now: " + this.balance);
        }
    }
}