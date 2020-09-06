
//Part 1.1.1 Создать 3 класса с публичными полями, которые описывают объекты из списка:
//Книга, Отделение почты, Клиент магазина, свой вариант.
//1.2 Константы.
//Дополнить классы константными значениями, полями класса (static final). Поля
//должны иметь отношение к предметной области.
//1.3 Создание экземпляров
//Создать дополнительный класс, например Main, для проверки предыдущих шагов.
//В этом классе создать main метод, в котором создать экземпляры описанных ранее
//классов.
//1.4 Инициализация полей объекта
//С помощью доступа к переменной, через «точку» у объекта класса,
//проинициализировать поля.
//Пример: obj.field = 12L;
//1.5 Вывод информации о объекте
//Вывести на экран информацию о каждом объекте в формате:
//Имя класса: Test
//Field1 = 123
//Field2 = ”qwerty”
/*Часть 2.
        2.1 Поменять все модификаторы доступа у полей экземпляра класса на private.
        Попробовать запустить Main класс. // Выполнено
        2.2 Сгенерировать во всех описанных классах методы get и set.
        Для того, чтобы быстро сгенерировать нужные, шаблонные методы, установите курсор в
        то место, где хотите вставить новый код и нажмите клавиши: alt + insert
        2.3 Заменить работу с полями класса через «точку», на работу через методы get и set.*/
/*Необходимо доработать созданные в ЛР7 (7. Обзор класса Java (Практика)) классы,
        дополнить их методами. Методы должны касаться специфики работы с объектом.
        Примеры методов:
        Для класса «Книга»: метод, который перелистывает на определенную страницу; метод,
        который возвращает список глав; метод, определяющий главу для указанной страницы.
        Для класса «Отделение почты»: метод приема списка посылок; метод, упаковки и
        отправки списка посылок;
        Для класса «Клиент магазина»: метод добавления товара в корзину; метод, просмотра
        накопленных бонусов; метод покупки товаров.
        Для своего варианта – свои методы.

        1.1 Дополнить классы нужными методами, для эмуляции действий просто выводить
        описание действия на экран.


        1.2 Вызвать методы в тестовом классе (Main)

        1.3 Перегрузить метод в одном из классов. Например, метод, который перелистывает на
        определенную страницу перегрузить методом, который перелистывает на
        определенную главу.

        1.4 Создать статический метод в любом из классов. Например, создать статический метод
        в классе «Отделение почты», который будет рассчитывать объемный вес посылки, в
        зависимости от переданных параметров.*/

public class Main {
    public static void main(String[] args) {
       /* Books book = new Books();
        book.name = "Dark Tower - 7 books";

        PostOffice post = new PostOffice();

        Market supMarket = new Market();
        */
        Books books = new Books();
        books.setName("The Dark Tower");
        Books.setPages(10000);
        System.out.println(Books.getAUTHOR());
        System.out.println(books.getName() + ", " + Books.getPages());
        Books books1 = new Books();
        books1.setName("It");
        Books.setPages(1138);
        System.out.println(books1.getName() + ", " + Books.getPages());
        Books books2 = new Books();
        books2.setName("The Shining");
        Books.setPages(447);
        System.out.println(books2.getName() + ", " + Books.getPages());
        System.out.println();
        System.out.println(books.flipPage(46));
        System.out.println();
        System.out.println(books.chapterListReturn(3));
        System.out.println();
        books.definingChapter(29);
        System.out.println();

        PostOffice post = new PostOffice();
        PostOffice.setName("New Poshta");
        PostOffice.setClients(100000);
        System.out.println(PostOffice.getName() + ", " + PostOffice.getClients() + ", " + post.getQUALIFICATION());
        PostOffice.setName("UkrPochta");
        PostOffice.setClients(10000);
        System.out.println(PostOffice.getName() + ", " + PostOffice.getClients());
        PostOffice.setName("Justin");
        PostOffice.setClients(1000);
        System.out.println(PostOffice.getName() + ", " + PostOffice.getClients());
        System.out.println();
        System.out.println(PostOffice.calcMass(2, 4, 8));
        System.out.println();
        post.receivingList("Новая почта");
        System.out.println();
        PostOffice.packingShipping(3);
        System.out.println();

        Market supMarket = new Market();
        Market.setName("ATB");
        Market.setClients(100000);
        System.out.println(Market.getDIRECTORS());
        System.out.println(Market.getName() + ", " + Market.getClients());
        Market.setName("Silpo");
        Market.setClients(10000);
        System.out.println(Market.getName() + ", " + Market.getClients());
        supMarket.addBin("Умар");
        System.out.println();
        System.out.println(supMarket.viewBonus(10));
        System.out.println();
        System.out.println(supMarket.buyProduct(10000,"Наличка", "Кредитка"));
    }
}

class Books {
    private String name;
    private static final String AUTHOR = "Stephen_King";
    private static int pages;
    int[] chapter = {1, 2, 3, 4};

    public int flipPage(int a) {
        int input = a;
        System.out.println("Вы читаете " + a + " страницу");
        return pages = input;
    }

    public int chapterListReturn(int a) {
        if (a == 1) {
            System.out.println("Вы читаете главу ");
            return chapter[0];
        } else if (a == 2) {
            System.out.println("Вы читаете главу ");
            return chapter[1];
        } else if (a == 3) {
            System.out.println("Вы читаете главу ");
            return chapter[2];
        } else {
            System.out.println("Вы читаете главу ");
            return chapter[3];
        }
    }

    public void definingChapter(int pages) {
        if (pages >= 0 && pages <= 10) {
            System.out.println("Глава определена как " + chapter[0]);
        } else if (pages > 10 && pages <= 20) {
            System.out.println("Глава определена как " + chapter[1]);
        } else if (pages > 20 && pages <= 30) {
            System.out.println("Глава определена как " + chapter[2]);
        } else {
            System.out.println("Глава определена как " + chapter[3]);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getAUTHOR() {
        return AUTHOR;
    }

    public static int getPages() {
        return pages;
    }

    public static void setPages(int pages) {
        Books.pages = pages;
    }
}

class PostOffice {
    private static String name;
    private static int clients;
    final int QUALIFICATION = 100;
    static int mass;

    public static int calcMass(int a, int b, int c) {
        System.out.println("Объёмный вес вашей посылки = кг ");
        return mass = a * b * c;
    }

    public void receivingList(String a) {
        name = a;
        if (name == "Новая почта") {
            System.out.println("Ваша посылка будет получена немедленно");
        } else if (name == "Укрпочта") {
            System.out.println("Ваша посылка будет получена через 3-4 дня");
        } else if (name == "Justin") {
            System.out.println("Ваша посылка будет получена через сутки");
        }
    }

    public static void packingShipping(int a) {
        mass = a;
        if (mass == 1) {
            System.out.println("Ваша посылка весом 1 кг, отправка 10$");
        } else if (mass == 2) {
            System.out.println("Ваша посылка больше 1 кг, отправка 10$ + 20$");
        } else {
            System.out.println("Ваша посылка тяжелая, заплатите пожалуйста 4-х кратную сумму");
        }
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        PostOffice.name = name;
    }

    public static int getClients() {
        return clients;
    }

    public static void setClients(int clients) {
        PostOffice.clients = clients;
    }

    public int getQUALIFICATION() {
        return QUALIFICATION;
    }
}

class Market {
    private static String name;
    private static final int DIRECTORS = 2;
    private static int clients;
    int bonus;
    public int money;

    public void addBin(String a) {
        name = a;
        if (name == "Умар") {
            System.out.println("Возьмите пожалуйста корзину с полки и наполняйте её " +
                    "по мере необходимости товарами");
        } else {
            System.out.println("Возьми пакет и клади туда не больше 2-х вещей");
        }
    }

    public int viewBonus(int a) {
        bonus = a;
        System.out.println("У вас " + bonus + " накопленных бонусов, эта сумма возведётся в квадрат!");
        return bonus * a;
    }

    public String buyProduct(int cash, String nalichka, String carta) {
        money = cash;
        if(cash <= 1000){
            return nalichka;
        }else {
            return carta;
        }
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Market.name = name;
    }

    public static int getDIRECTORS() {
        return DIRECTORS;
    }

    public static int getClients() {
        return clients;
    }

    public static void setClients(int clients) {
        Market.clients = clients;
    }
}
