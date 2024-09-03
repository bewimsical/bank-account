public class CreditAccount extends Account{
    private double creditLimit;
    public CreditAccount(){
        super();
        this.creditLimit = 10000.00;
    }
    public CreditAccount(double promo, double _creditLimit){
        setBalance(promo);
        this.creditLimit = _creditLimit;
    }
//deposit method simulates paying off the credit card balance.
    public boolean deposit(double _amount){
        if (_amount <= 0 || _amount > getBalance()){
            System.out.println("Payment amount not valid.");
            return false;
        }
        setBalance(getBalance() - _amount);
        return true;
    }
//    Withdraw method simulates using a credit card to make a purchase
    public  boolean withdraw(double _amount){
        if (_amount > this.creditLimit){
            System.out.println(":) you have no money my friend");
            return false;
        }
        if (_amount <= 0) {
            System.out.println("Really");
            return false;
        }
        setBalance(getBalance() + _amount);
        this.creditLimit -= _amount;
        return true;
    }

    @Override
    public  String toString(){
        String content = "The balance is " + getBalance();
        return content;
    }
}
