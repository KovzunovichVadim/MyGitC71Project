public class CreditCard {
    int accountNumber;
    double sumOnAccount;

    public CreditCard(int accountNumber, double sumOnAccount) {
        this.accountNumber = accountNumber;
        this.sumOnAccount = sumOnAccount;
    }

    double addMoney(double sumAdd) {
        return sumOnAccount = sumOnAccount + sumAdd;
    }

    double deleteMoney(double summDel) {
        return sumOnAccount = sumOnAccount - summDel;
    }

    void accountInfo() {
        System.out.println("Номер счета: " + accountNumber);
        System.out.println("Сумма на счету: " + sumOnAccount);
    }
}
