import java.util.Scanner;

public class DepositMoney {



    public void depositMoney() {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the amount: ");
//        Scanner sc=new Scanner(System.in);
        float amt = sc.nextFloat();
        menu.Balance = menu.getBalance() + amt;
        System.out.println("Money Deposited Successfully");
        menu.menu();
    }
}
