public class Main {
    public static void main(String[] args) {

        System.out.println("Домашка 8, часть 2, задача 1, WHILE накопления с процентами, без капитализации:");
        int deposit = 15_000;
        double percentMonth = 0.07;
        double saving = deposit;
        int month = 1; // Жизни Василию не хватит копить по 7 % от 15 тыс.
        while (saving <= 120_00000) {
            saving = saving + deposit * percentMonth;
            if (saving < 1000_000) {
                System.out.print("Месяц " + (month++) + " - сумма накоплений равна " + saving + " руб. "); // вывод в строку для компакности
            }
            if (saving > 1000_000) {
                System.out.print("Месяц " + (month++) + " - сумма накоплений равна " + saving / 1000_000 + " млн. руб. ");
            }
        }
    }
}
