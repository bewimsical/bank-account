public class CreditAccount extends Account{
//   Implement a credit limit
    private final double creditLimit;
    public CreditAccount(){
        super();
        this.creditLimit = 10000.00;
    }
    public CreditAccount(double _creditLimit){
        super();
        this.creditLimit = _creditLimit;
    }
    // Override the deposit method to accommodate the credit limit
    //deposit method simulates paying off the credit card balance.
    public boolean deposit(double _amount){
        //implement logic to handle scenarios where deposits bring the account back within the credit limit
        if (_amount <= 0 || _amount > getBalance()){
            System.out.println("Payment amount not valid.");
            return false;
        }
        setBalance(getBalance() - _amount);
        return true;
    }
    // Override the withdraw method to accommodate the credit limit
    // Withdraw method simulates using a credit card to make a purchase
    public  boolean withdraw(double _amount){
        //Ensure that the credit limit is not exceeded during withdrawals.
        if (_amount > this.creditLimit - getBalance()){
            System.out.println(":) you have no money my friend");
            return false;
        }
        if (_amount <= 0) {
            System.out.println("Really");
            return false;
        }
        setBalance(getBalance() + _amount);
        return true;
    }

    @Override
    public  String toString(){
        String content = "The balance is " + getBalance();
        return content;
    }
}
