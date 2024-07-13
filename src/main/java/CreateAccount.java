import java.util.Scanner;

public class CreateAccount {



    public void createAccount() {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();

        System.out.println("Enter Details: ");
        System.out.print("Enter Name : ");
        String name = sc.next();
        System.out.print("Enter Cellphone : ");
        String cellphone = sc.next();
        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        System.out.println("===================================");
        System.out.println("Name \t\t\t: " + name);
        System.out.println("Phone Number \t: " + cellphone);
        System.out.println("Age \t\t\t: " + age);
        System.out.println("--- [ Account created successfully ] ---");
        System.out.println("===================================");
        menu.menu();

    }
}
