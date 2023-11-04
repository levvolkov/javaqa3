public class Main {
    public static void main(String[] args) {
        int balance = 300;// сумма на счету клиента
        int xreplenishment = 400; // суммы пополнения
        int replenishment = 1800; // суммы пополнения

        int bonus;
        System.out.println("Ваш баланс: " + balance + " рублей ");
        System.out.println("Поступления на счет: " + xreplenishment + " рублей ");
        System.out.println("Поступления на счет: " + replenishment + " рублей ");

        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int deposit = balance + xreplenishment + replenishment;
        System.out.println("Ваш баланс: " + ( deposit + bonus ) + " рублей ");
        System.out.println("Начисленные бонусы: " + bonus + " бонусных рублей ");
    }
}