public class DebitAccount extends Account {
    DebitAccount(){
        super();
    }
    DebitAccount(double promo){
        super(promo);
    }
    public boolean deposit(double _amount){
        if (_amount <= 0){
            System.out.println("Incorrect Amount. Value is less than or equal to zero.");
            return false;
        }
        setBalance(getBalance() + _amount);
        /*
        * double _balance = getBalance();
        * _balance = _balance + _amount;
        * setBalance(_balance) ;
        * */
        return true;
    }
    public boolean withdraw(double _amount){
        if (_amount > getBalance()){
            System.out.println(":) you have no money my friend");
            return false;
        }
        if (_amount <= 0){
            System.out.println("Really");
            return false;
        }
        double _balance = getBalance();
        _balance -= _amount;
        setBalance(_balance);
        return true;
    }
    @Override
    public  String toString(){
        String content = "The balance is " + getBalance();
        return content;
    }
}
