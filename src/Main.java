import Entities.Account;
import Entities.BusinessAccount;
import Entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc1 = new Account(1001, "Pedro", 1000.0);
        acc1.withdraw(200);
        System.out.println(acc1.getBalance());

        SavingsAccount acc2 = new SavingsAccount(1002, "Italo", 1000.0, 99999.9);
        acc2.withdraw(200);
        System.out.println(acc2.getBalance());
    }


}