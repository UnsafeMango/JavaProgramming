public class Main {

    public static void main(String[] args) {
        Account bobsAccount = new Account(); //"12345", 0.00, "Bob Brown",
                //"myeamil@bob.com", "(077) 123-5673"); //calling a constructor
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50);
        bobsAccount.withdrawal(100);

        bobsAccount.deposit(60);
        bobsAccount.withdrawal(100);

        Account timsAccount = new Account("Tim", "tim@email.com",
                "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
        System.out.println("Current Account is " + timsAccount.getBalance());
        timsAccount.withdrawal(100.55);


//        VipCustomer person1 = new VipCustomer();
//        System.out.println(person1.getName());
//
//        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
//        System.out.println(person2.getName());
//
//        VipCustomer person3 = new VipCustomer("Tim", 100.00, "mango@gmail.com");
//        System.out.println(person3.getName());


    }
}
