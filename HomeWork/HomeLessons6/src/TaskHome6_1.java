public class TaskHome6_1 {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(4145,500);
        CreditCard creditCard2 = new CreditCard(4146,600);
        CreditCard creditCard3 = new CreditCard(4147,700);

        creditCard1.addMoney(200);
        creditCard1.accountInfo();

        creditCard2.deleteMoney(300);
        creditCard2.accountInfo();



    }
}