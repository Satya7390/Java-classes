package Challenge77To79.challenge78;

public class Customer {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Satya", "USB456234");

        account.depositMoney(100);
        System.out.println(account.withdrawMoney(200));
        account.depositMoney(-100);
        account.withdrawMoney(0);
    }
}

// Outputs : 
// 100.0
// Invalid Deposite
// Invalid Withdrawal
