public class ATM {
    int numberBanknote20;
    int numberBanknote50;
    int numberBanknote100;

    public ATM(int kolvoBanknote20, int kolvoBanknote50, int kolvoBanknote100) {
        this.numberBanknote20 = kolvoBanknote20;
        this.numberBanknote50 = kolvoBanknote50;
        this.numberBanknote100 = kolvoBanknote100;
    }

    void addBankmoteATM(int add20, int add50, int add100) {
        numberBanknote20 = numberBanknote20 + add20;
        numberBanknote50 = numberBanknote50 + add50;
        numberBanknote100 = numberBanknote100 + add100;
    }

    boolean takeOfBanknote(int needMoney) {
        int number20 = 0;
        int number50 = 0;
        int number100 = 0;
        int n = needMoney;
        int n1 = 0;

        if (needMoney > numberBanknote20 * 20 + numberBanknote50 * 50 + numberBanknote100 * 100 || needMoney <= 0) {
            return false;
        }

        while (needMoney != 0) {
            if (needMoney == 10 || needMoney == 30) {
                System.out.println("В банкомате нет банкнот номиналом 10. Введите другую сумму");
                break;
            }

            if (needMoney % 100 == 10 || needMoney % 100 == 30) {
                number100 = numberBanknote100 * 100 >= needMoney ? needMoney / 100 - 1 : numberBanknote100 - 1;
                needMoney -= number100 * 100;
                System.out.println(1);
            } else {
                number100 = numberBanknote100 * 100 >= needMoney ? needMoney / 100 : numberBanknote100;
                needMoney -= number100 * 100;
                System.out.println(2);
            }

            if (needMoney % 50 == 10 || needMoney % 50 == 30) {
                number50 = numberBanknote50 * 50 >= needMoney ? needMoney / 50 - 1 : numberBanknote50 - 1;
                needMoney -= number50 * 50;
                System.out.println(3);
            } else {
                number50 = numberBanknote50 * 50 >= needMoney ? needMoney / 50 : numberBanknote50;
                needMoney -= number50 * 50;
                System.out.println(4);
            }

            if (needMoney % 20 == 0 && numberBanknote20 >= needMoney / 20) {
                number20 = needMoney / 20;
                needMoney -= number20 * 20;
                System.out.println(5);
            } else {
                System.out.println("Недостаточно средств в банкомате");
                return false;
            }
        }

        this.numberBanknote100 = number100;
        this.numberBanknote50 = number50;
        this.numberBanknote20 = number20;
        System.out.println("Сумма снятых денег = " + (number100 * 100 + number50 * 50 + number20 * 20));
        System.out.print("Банкнот 100 = " + number100 + " / ");
        System.out.print("Банкнот 50 = " + number50 + " / ");
        System.out.print("Банкнот 20 = " + number20 + " !");
        return true;
    }
}

