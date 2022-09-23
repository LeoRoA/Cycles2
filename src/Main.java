public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int sum1, vklad1, i, percent1;
        sum1 = 0;
        vklad1 = 15000;
        percent1 = 7;
        i = 1;
        while (sum1 < 12_000_000){
            sum1 = sum1 + sum1 * percent1/100 + vklad1;
            i++;
        }
        System.out.printf("Месяц %d , сумма накоплений равна %d рублей\n", i, sum1);

        //Задание 2
        System.out.println("Задание 1");
        int sum2, vklad2, j, percent2;
        sum2 = 0;
        vklad2 = 15000;
        percent2 = 7;
        j = 1;
        while (sum2< 12_000_000){
            sum2 = sum2 + sum2 * percent2/100 + vklad2;
            j++;
            if (j % 6 == 0){
                System.out.printf("Месяц %d , сумма накоплений равна %d рублей\n", j, sum1);
            }
        }
        //Задание 3
        System.out.println("\nЗадание 3");
        int sum3, vklad3, month, percent3, year;
        sum3 = 0;
        month = 1;
        vklad3 = 15000;
        percent3 = 7;
        year = 0;
        while (year < 9){
            sum3 = sum3 + sum3 * percent3 / 100 + vklad3;
            year = month / 12;
            if (month % 6 == 0){
                System.out.printf("Месяц %d , сумма накоплений равна %d рублей\n", month, sum3);
            }
            month++;
        }
        System.out.printf("На %d год, накопления составляют %d", year, sum3);

        //Задание 4
        System.out.println("\nЗадание 4");
        int fFriday = 6;
        int day = 1;
        while (day <= 31){
            if (day % fFriday == 0) {
                System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.\n",day);
            }
            day++;
        }

    }
}