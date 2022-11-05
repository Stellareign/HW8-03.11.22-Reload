public class Main {
    public static void main(String[] args) {

        System.out.println("Домашка 8, часть 3, задача 1, циклы, про кометы:");
        int presentYear = 2022;
        int futureYear = presentYear + 100; // сто лет вперёд
        int pastYear = 200; // 200 лет назад
        for  (int year = 0; year <= futureYear; year = year + 79) {
            if (year >= presentYear - pastYear) {
                System.out.println(year);
            }
        }
        System.out.println("Домашка 8, часть 3, задача 2, циклы, таблица умножени, х2:");
        int multiplier = 2;
        int number = 1;
        int increase;
        for (number = 1; number <= 10; number++) {
            increase = number * multiplier;
            System.out.println(multiplier + " * " + number + " = " + increase);
        }
    }
}