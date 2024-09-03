public class Main {
    public static void main(String[] args) {
        CreditAccount dbt1 = new CreditAccount();
        DebitAccount dbt2 = new DebitAccount(25);
        dbt1.deposit(100);
        dbt1.withdraw(55);
        System.out.println(dbt1.toString());

    }
}

/*
* implement the credit account
*   add credit limit
* implement the loan account
*   loan account has interest
*   how much you are paying towards the loan and interest*/
