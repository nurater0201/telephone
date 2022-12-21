public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int addBalance = 1100;
        int bonus = 1;
        int amount = (balance + addBalance);
        int addBonus;
        if (amount >= 1000) {
            addBonus = (amount / 100 * bonus);
        } else {
            addBonus = 0;
        }


        System.out.println("Баланс:" + amount + addBonus);
    }
}

