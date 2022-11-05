public class Main {
    public static void main(String[] args) {

        System.out.println("Домашка 8, часть 2, задача 2, циклы, накопления каждые полгода:");
        int deposit = 15000;
        double saving = 0;
        double percentMonth = 0.07;
        saving = deposit;
        int month = 1;
        for (; saving <= 12000_000; month++) {
            saving = saving + deposit * percentMonth;
            if (i % 6 == 0) {

                if (saving < 1000_000) {
                    System.out.print("Месяц " + month + " - сумма накоплений равна " + saving + " руб. ");
                } else if (saving > 1000_000) {
                    System.out.print("Месяц " + month + " - сумма накоплений равна " + saving / 1000_000 + " млн. руб. ");
                }
            }
        }
    }
}