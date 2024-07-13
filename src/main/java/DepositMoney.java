import java.util.Scanner;

public class DepositMoney {

    Menu menu = new Menu();
    Scanner sc = new Scanner(System.in);

    public void depositMoney() {


        System.out.println("Enter the amount: ");
//        Scanner sc=new Scanner(System.in);
        float amt = sc.nextFloat();
        menu.Balance = menu.Balance + amt;
        System.out.println("Money Deposited Successfully");
        menu.menu();
    }
}
