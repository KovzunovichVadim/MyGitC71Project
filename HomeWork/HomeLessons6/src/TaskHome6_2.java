public class TaskHome6_2 {
    public static void main(String[] args) {
        ATM atm = new ATM(40, 40, 40);
        System.out.println(atm.numberBanknote20);
        atm.addBankmoteATM(20, 20, 20);
        System.out.println("Количество банконот 20 = " + atm.numberBanknote20);
        System.out.println("Количество банконот 50 = " + atm.numberBanknote50);
        System.out.println("Количество банконот 100 = " + atm.numberBanknote100);

        atm.takeOfBanknote(30);
    }
}
