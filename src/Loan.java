public class Loan extends BaseLoan {

    private int loanId;
    private double loanAmount;
    private int period;
    private double rate;

    public Loan(int loanId, double loanAmount, int period) {
        this.loanId = loanId;
        this.loanAmount = loanAmount;
        this.period = period;
    }

    @Override
    public double getMonthlyPayment() {
        boolean isValid = true;
        if (this.loanAmount <= 0) {
            System.out.println("Invalid loan amount");
            isValid = false;
        }
        if (this.period <= 6 || this.period >= 360) {
            System.out.println("Invalid loan repayment period");
            isValid = false;
        }
        if (this.rate <= 0 || this.rate >= 0.1) {
            System.out.println("Invalid loan rate");
            isValid = false;
        }
        double mp = 0;
        if (isValid) {
            mp = this.loanAmount * ((this.rate * Math.pow((1 + this.rate), this.period)) / (Math.pow((1 + this.rate), this.period) - 1));
        }
        return mp;
    }

    @Override
    public double getTotalInterestPercentage() {
        return (((this.getMonthlyPayment() * this.period) - this.loanAmount) / this.loanAmount) * 100;
    }

    public void setR(double rate) {
        this.rate = rate;
    }

    public int getLoanId() {
        return loanId;
    }
}
