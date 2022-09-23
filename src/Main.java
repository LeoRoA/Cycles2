public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int sum1, vklad1, i;
        sum1 = 0;
        vklad1 = 15000;
        i = 1;
        while (sum1 < 2_459_000){
            sum1=sum1 + sum1/100 + vklad1;
            i++;
        }
        System.out.printf("Месяц %d , сумма накоплений равна %d рублей\n", i, sum1);

        //Задание 2
        System.out.println("Задание 2");
        int j = 0;
        while (j < 10) {
            j++;
            System.out.printf("%d\t",j);
        }
        System.out.print("\n");
        for (;j>=1;j--){
            System.out.printf("%d\t",j);
        }
        //Задание 3
        System.out.println("\nЗадание 3");
        int population, year, b, d;
        population = 12_000_000;
        year = 1;
        b = 17;
        d = 8;
        while (year < 10){
            population = (population/1000 + b - d) * 1000;
            year++;
        }
        System.out.printf("Год %d, численность населения составляет %d", year, population);
    }
}