public abstract class Account {
    private double balance;
//    set up default constructor
    public Account(){
        this.balance = 0;
    }
    public Account(double _balance){
        this.balance = _balance;
//        the underscore is a naming convention to make the param easy to recognise
    }
//    set up copy constructor
    public Account(Account act){
        this.balance = act.balance;
    }
//    accessor aka getter
    public double getBalance(){
        return this.balance;
    }
//    mutator aka setter
    public void setBalance(double _balance){
        this.balance = _balance;
    }
    public abstract boolean deposit(double _amount);
    public abstract boolean withdraw(double _amount);
}
