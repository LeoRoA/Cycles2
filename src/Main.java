public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int oE, comet, thisYear, year, startPeriod, endPeriod;
        year = 0;
        thisYear = 2022;
        startPeriod = thisYear - 200;
        endPeriod = thisYear + 100;
        comet = 79;
        for (oE = 0; oE < startPeriod; oE += comet){
            year = oE;
            }
        while (year <= endPeriod) {
            System.out.println(year);
            year = year + comet;
        }


        //Задание 2
        System.out.println("Задание 2");
       for (int i = 1; i <= 10; i++){
            System.out.println("2*" + i + "=" + (i * 2));
            }
        }
        /*
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

    }*/
}