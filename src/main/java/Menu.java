import java.util.Scanner;

import static java.lang.System.exit;

public class Menu{

    public float Balance;
    int PIN = 1234;
    Scanner sc = new Scanner(System.in);


    public float getBalance() {
        return Balance;
    }

    public void checkpin() {
        System.out.println("Entered your pin: ");
        int enteredPin = sc.nextInt();
        if (enteredPin == PIN) {
            menu();
        }
        if (enteredPin != PIN) {
            System.out.println("Wrong pin entered, please try again :");
            int value1 = sc.nextInt();
            enteredPin(value1);
        } else if (enteredPin != PIN) {
            System.out.println("Operation terminated.");
            int value2 = sc.nextInt();
            enteredPin(value2);
            exit(0);

        }


    }
    public void enteredPin(int value) {
        if (value == PIN) {
            menu();
        }
    }

    public void menu() {

        DepositMoney depositMoney = new DepositMoney();
        CreateAccount createAccount = new CreateAccount();

        System.out.println("Enter Your Choice :");
        System.out.println("1. Check A/c Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Create an account");
        System.out.println("5. Exit");
        Scanner sc=new Scanner(System.in);
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                checkBalance();
            case 2:
                withDrawMoney();
            case 3:
                depositMoney.depositMoney();
            case 4:
                createAccount.createAccount();
            case 5:
                exit(opt);
        }

    }

    public void checkBalance() {

        System.out.printf("Balance: R %.2f\n", + Balance);
        menu();
    }

    public void withDrawMoney() {

        System.out.println("Enter Amount to Withdraw: ");
//        Scanner sc=new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > getBalance()) {
            System.out.println("Insufficient Balance");
        } else {
            Balance = getBalance() - amount;
            System.out.println("Money Withdrawal Successfully");
        }
        menu();
    }



}
