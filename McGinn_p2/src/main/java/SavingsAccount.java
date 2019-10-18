 class SavingsAccount {

    private static double annualInterestRate;

    private double savingsBalance;


     public static void modifyInterestRate(double changeRate){
         annualInterestRate = changeRate;
     }

    public double calculateMonthlyInterest(double comp){
        double interest;

             interest = savingsBalance + comp + (((savingsBalance + comp) * annualInterestRate) / 12);
             return interest;
    }

    public SavingsAccount(double saver){

         savingsBalance = saver;
    }
}
