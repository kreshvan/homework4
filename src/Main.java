public class Main {
    public static void main(String[] args) {

//задание 1
        int A =5000;
        System.out.println("Значение переменной A с типом int равно"+" "+A);
        byte B = 100;
        System.out.println("Значение переменной B с типом byte равно"+" "+B);
        short C = 1000;
        System.out.println("Значение переменной C с типом short равно"+" "+C);
        long D = 3000;
        System.out.println("Значение переменной D с типом long равно"+" "+D);
        float Y = 3.4f;
        System.out.println("Значение переменной Y с типом float равно"+" "+Y);
        double F = 1.5;
        System.out.println("Значение переменной F с типом short равно"+" "+F);
        //задание 2
        float a = 27.12f;
        long b = 987678965549l;
        double t = 2.786;
        int r = 569;
        short q = -159;
        char w = 27897;
        byte v = 67;
        //задание 3
        int teacher1 = 23;
        int teacher2 = 27;
        int teacher3 = 30;
        int summaT = teacher1 + teacher2 + teacher3;
        //сумма листов 480
        int student1 = 480/summaT;
        System.out.println("На каждого ученика рассчитано" + " "+ student1+ " "+  "листов бумаги");
        //задание 4
        // производительность 16 бут. за 2 мин . За 1 мин 8 бут.
        int botlA = 8*20;
        System.out.println("За 20 мин машина произвела" + " " + botlA + " " + "штук бутылок");
        // в сутках 1440 мин
        int botlB = 1440*8;
        System.out.println("За 1440 мин машина произвела" + " " + botlB + " " + "штук бутылок");
        // 3 дня = 4320;
        int botlC = 4320*8;
        System.out.println("За 4320 мин машина произвела" + " "+ botlC+ " " + "штук бутылок");
        // в месяце 43200 мин
        long botlD = 43200*8;
        System.out.println("За 43200 мин машина произвела" + " "+ botlD+ " " + "штук бутылок");
//задание 5
        // 1 банан 80гр.
        int banana = 80 *5;
        // молоко 100мл=105гр
        int milk = 105*2;
        int ice = 100*2;
        int egg = 4*70;

        int summa0 = banana + milk + ice + egg;
       System.out.println(summa0 + " " + "гр.");
        // 1кг =1000гр
        float summa00 = (banana + milk + ice + egg)/1000f;
System.out.println(summa00+" "+ "кг");

        //задача7
        // 7кг = 7000гр.
        int day1 = 7000/250;
                int day2 = 7000/500;
        float day3 = 7000/(250+500);
        System.out.println(day1+"   "+ day2+" "+"   " +day3);
        //задание 8

        int AA = 67760;
        int BB = 83690;
        int CC = 76230;
        // +10%
        int AA1 = AA+AA/100*10;
        int BB1 = BB+BB/100*10;
        int CC1 = CC+CC/100*10;
        //РАЗНИЦА
        int AAA = AA1-AA;
        int BBB = BB1-BB;
        int CCC = CC1-CC;
        System.out.println("Маша теперь получает" + " "+ AA1+" "+ "рублей."+"Годовой доход вырос на" + " " + AAA + " " + "рублей");
        System.out.println("Денис теперь получает" + " "+ BB1 +" "+ "рублей."+"Годовой доход вырос на" + " " + BBB + " " + "рублей");
        System.out.println("Критина теперь получает" + " " + CC1+ " " + "рублей."+"Годовой доход вырос на" + " " + CCC + " " + "рублей");




































    }
}