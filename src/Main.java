public class Main {

    public static void main(String[] args) {
        Loan loan = new Loan(1, 1200000, 30);
        loan.setR(0.01);
        System.out.println("Loan Id " + loan.getLoanId() + " Monthly Payment is Rs. " + loan.getMonthlyPayment());
        System.out.println("Loan Id " + loan.getLoanId() + " Total Interest: " + loan.getTotalInterestPercentage() + "%");
    }
}



