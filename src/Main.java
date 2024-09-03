public class Main {
    public static void main(String[] args) {
        DebitAccount dbt1 = new DebitAccount();
        DebitAccount dbt2 = new DebitAccount(25);
        dbt2.deposit(100);
        dbt2.withdraw(25);
        System.out.println(dbt2.toString());

    }
}

/*
* implement the credit account
*   add credit limit
* implement the loan account
*   loan account has interest
*   how much you are paying towards the loan and interest*/
