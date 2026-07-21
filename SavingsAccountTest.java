public class SavingsAccountTest {

    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);

        SavingsAccount.modifyInterestRate(0.04);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("After 4% Interest");
        System.out.printf("Saver1 Balance = Rs %.2f%n", saver1.getsavingbalance());
        System.out.printf("Saver2 Balance = Rs %.2f%n", saver2.getsavingbalance());

      
        SavingsAccount.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("\nAfter 5% Interest");
        System.out.printf("Saver1 Balance = Rs %.2f%n", saver1.getsavingbalance());
        System.out.printf("Saver2 Balance = Rs %.2f%n", saver2.getsavingbalance());
    }
}