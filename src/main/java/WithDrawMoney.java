import java.util.Scanner;

public class WithDrawMoney {
    Menu menu = new Menu();
    Scanner sc = new Scanner(System.in);
    public void withDrawMoney() {
        System.out.println("Enter Amount to Withdraw: ");
//        Scanner sc=new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > menu.Balance) {
            System.out.println("Insufficient Balance");
        } else {
            menu.Balance = menu.Balance - amount;
            System.out.println("Money Withdrawl Successfully");
        }
        menu.menu();
    }
}
