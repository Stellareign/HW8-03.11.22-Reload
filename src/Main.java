public class Main {
    public static void main(String[] args) {

        System.out.println("Домашка 8, часть 2, задача 2, циклы, накопления, вывод каждые полгода:");
        int deposit = 15000;
        double saving = 0;
        double percentMonth = 0.07;
        saving = deposit;
        int month = 0;
        int periodYears = 9;
        for (month = 1; month <= 12 * periodYears; month++) {
            saving = saving + deposit * percentMonth;
            if (month % 6 == 0) {
                if (saving < 1000_000) {
                    System.out.print("Месяц " + month + " - сумма накоплений равна " + saving + " руб. ");
                } else if (saving > 1000_000) {
                    System.out.print("Месяц " + month + " - сумма накоплений равна " + saving / 1000_000 + " млн. руб. ");
                    // Вывод в строку для большей компактности.
                    // Как сделать, чтобы выводилось меньше знаков после запятой?
                    //хдее??
                }
            }
        }
    }
}
