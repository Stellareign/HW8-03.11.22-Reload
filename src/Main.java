public class Main {
    public static void main(String[] args) {

        System.out.println("Домашка 8, часть 2, задача 4, циклы:" +
                "Написать программу, которая считает дни месяца по датам, определяет, " +
                "какой день пятница, и выводит сообщение с напоминанием, что нужно " +
                "подготовить еженедельный отчет.");
        int firstFriday = 3;
        for (int monthDay = 1; monthDay <= 31; monthDay++) {
            for (int everyFriday = firstFriday; everyFriday <= 31; everyFriday = everyFriday + 7) {
                if (monthDay == everyFriday) {
                    System.out.println("Сегодня пятница, " + monthDay + " число. Необходимо подготовить отчет.");
                }
            }
        }
    }
}