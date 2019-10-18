public class Accounts {
    public static void main( String[] args ){
        SavingsAccount.modifyInterestRate(.04);
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        System.out.println("month 1");
        System.out.printf("new balance for saver1 at 4 percent interest is $%.2f\n", saver1.calculateMonthlyInterest(0));

        SavingsAccount saver2 = new SavingsAccount(3000.00);
        System.out.printf("new balance for saver2 at 4 percent interest is $%.2f\n", saver2.calculateMonthlyInterest(0));
        System.out.println("month 2");
        SavingsAccount.modifyInterestRate(.05);
        System.out.printf("new balance for saver1 at 5 percent interest is $%.2f\n", saver1.calculateMonthlyInterest(6.67));

        System.out.printf("new balance for saver2 at 5 percent interest is $%.2f\n", saver2.calculateMonthlyInterest(10));

    }
}
