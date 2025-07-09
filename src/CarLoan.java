public class CarLoan {
    public static void main(String[] args) {
//this program calculate your monthly payment for a car loan, depending on you down payment and loan length
        int carLoan = 10000;
        int loanLength = 3; //3 year loan
        int interestRate = 5; //5% interest rate on the loan
        int downPayment = 2000;

        if (loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan.");
        } else if (downPayment >= carLoan) {
            System.out.println("The car can be paid in full.");
        } else {
            // Calculate the remaining balance after down payment
            int remainingBalance = carLoan - downPayment;
            // Convert loan length to months
            int months = loanLength * 12;
            // Calculate monthly payment before interest
            int monthlyBalance = remainingBalance / months;
            // Calculate monthly interest
            int interest = (monthlyBalance * interestRate) / 100;
            // Final monthly payment
            int monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);
        }
    }
}