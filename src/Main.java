public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 8, часть 1, задача 1, WHILE накопления с процентами:");
        int deposit = 15_000;
        double saving = 0;
        double percentMonth = 1.01;
        int i = 1;
        while (saving <= 2_459_000) {
            saving = deposit + saving*percentMonth;
            System.out.print("Месяц " + (i++) + " - сумма накоплений равна " + saving + ". ");
        }
        System.out.println("" +
                "");
        System.out.println("Домашка 8, часть 1, задача 2, WHILE/FOR числа от 1 до 10:"); // утеряна в гите
        int number = 1;
        while (number <= 10) {
            System.out.print((number++) + ("; "));
        }
        System.out.println("" +
                "");
        for (number = 10; number >= 1; number--) {
            System.out.print(number + "; ");
        }

        System.out.println("" +
                "");
        System.out.println("Домашка 8, часть 1, задача 3, WHILE/FOR - численность населения:");
        int year = 2020;
        int populationStart = 12_000_000;
        int populationGrowth = 17 * (12_000_000 / 1000);
        int populationDecline = 8 * (12_000_000 / 1000);
        int population = populationStart + populationGrowth - populationDecline;
        for (int period = 1; period <= 10; period++){
            population = population + populationGrowth - populationDecline;
            System.out.println("В году " + (year++) + " численность населения соствляет " + population +" человек.");
        }
    }
}