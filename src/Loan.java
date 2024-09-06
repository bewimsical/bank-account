public class Loan extends Account {
    private final double interestRate;

    private double principal;
    private double interest;
    //Variables to track payments to principal and interest portions.
    private double paidPrincipal;
    private double paidInterest;


    public Loan(){
        super();
        this.interestRate = 0.02;
    }
    public Loan(double _interestRate){
        super();
        this.interestRate = _interestRate;
        this.principal = 0;
        this.interest = 0;
    }
    //Apply payments, first to interest and then to the principal.
    public boolean deposit(double _amount){
        double remaining = _amount;
        if(_amount > getBalance()){
            System.out.println("you paid too much!");
            return false;
        }
        if (remaining >= this.interest){
            remaining -= this.interest;
            this.interest = 0;
        }
        else{
            this.interest -= remaining;
            remaining = 0;
        }
        this.paidInterest = _amount - remaining;
        this.principal -= remaining;
        this.paidPrincipal += remaining;

        setBalance(this.principal + this.interest);
        return true;
    }
    // borrow money from the bank. you can always borrow more money
    public boolean withdraw(double _amount){
        this.principal += _amount;
        setBalance(getBalance() + _amount);
        this.interest += calculateInterest();
        // interest applied to the outstanding balance.
        setBalance(getBalance() + calculateInterest());
        return true;
    }
    //Calculate interest on the outstanding balance.
    private double calculateInterest(){
        return getBalance() * this.interestRate;
    }
    //Methods to track the total payments made towards both principal and interest
    public double getInterestPayments(){ return this.paidInterest;}
    public double getPrincipalPayments(){ return this.paidPrincipal;}
    //print record of how much has been paid towards the interest, the principal, and the total amount paid.
    public void printLoanStatement(){
        System.out.println("Current Balance: " + getBalance());
        System.out.println("Principal Balance: " + this.principal);
        System.out.println("Interest Balance: " + this.interest);
        System.out.println("Total amount paid: " + (this.paidInterest + this.paidPrincipal));
        System.out.println("Principal payments: " + this.paidPrincipal);
        System.out.println("Interest payments " + this.paidInterest);
    }
}
