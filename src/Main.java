
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

        1.3 Перегрузить метод водном из классов. Например, метод, который перелистывает на
        определенную страницу перегрузить методом, который перелистывает на
        определенную главу.

        1.4 Создать статический метод в любом из классов. Например, создать статический метод
        в классе «Отделение почты», который будет рассчитывать объемный вес посылки, в
        зависимости от переданных параметров.*/
public class Main {
    public static void main(String[] args) {
       /* Books book = new Books();
        book.name = "Dark Tower - 7 books";
        book.name2 = "It";
        book.name3 = "The Shining";
        book.pagesDark = 100000;
        book.pagesIt = 1138;
        book.pagesShining = 447;
        System.out.println(book.author);
        System.out.println(book.name + " " + book.pagesDark);
        System.out.println(book.name2 + " " + book.pagesIt);
        System.out.println(book.name3 + " " + book.pagesShining);
        PostOffice post = new PostOffice();
        post.name = "Новая почта";
        post.name2 = "Укрпочта";
        post.name3 = "Justin";
        post.clientsNewPost = 1000000;
        post.clientsUkr = 500000;
        post.clientsJustin = 200000;
        System.out.println(post.name + " " + post.clientsNewPost);
        System.out.println(post.name2 + " " + post.clientsUkr);
        System.out.println(post.name3 + " " + post.clientsJustin);
        Market supMarket = new Market();
        supMarket.name = "Сільпо";
        supMarket.name2 = "Varus";
        supMarket.name3 = "ATB";
        supMarket.clientsVarus = 2000;
        supMarket.clientsATB = 100000;
        System.out.println(supMarket.name + " " + supMarket.CLIENTS_SILPO);
        System.out.println(supMarket.name2 + " " + supMarket.clientsVarus);
        System.out.println(supMarket.name3 + " " + supMarket.clientsATB);*/
        Books books = new Books();
        books.setName("Dark Tower - 7 books");
        books.setName2("It");
        books.setName3("The Shining");
        books.setPagesDark(100000);
        books.setPagesShining(447);
        books.setPagesIt(1138);
        System.out.println(books.getAuthor());
        System.out.println(books.getName());
        System.out.println(books.getPagesDark());
        System.out.println(books.getName2());
        System.out.println(books.getPagesIt());
        System.out.println(books.getName3());
        System.out.println(books.getPagesShining());
        System.out.println();
        System.out.println(books.flipPage(2,4));
        System.out.println();

        PostOffice post = new PostOffice();
        post.setName("Новая почта");
        post.setName2("Укрпочта");
        post.setName3("Justin");
        post.setClientsNewPost(1000000);
        post.setClientsUkr(500000);
        post.setClientsJustin(200000);
        System.out.println(post.getName());
        System.out.println(post.getClientsNewPost());
        System.out.println(post.getName2());
        System.out.println(post.getClientsUkr());
        System.out.println(post.getName3());
        System.out.println(post.getClientsJustin());
        System.out.println();
        System.out.println(PostOffice.calcMass(2,5,6));
        System.out.println();

        Market supMarket = new Market();
        supMarket.setName("Silpo");
        supMarket.setName2("Varus");
        supMarket.setName3("ATB");
        supMarket.setClientsATB(100000);
        supMarket.setClientsVarus(2000);
        System.out.println(supMarket.getName());
        System.out.println(supMarket.getClientsSilpo());
        System.out.println(supMarket.getName2());
        System.out.println(supMarket.getClientsVarus());
        System.out.println(supMarket.getName3());
        System.out.println(supMarket.getClientsATB());
        System.out.println(supMarket.viewBonus(20));
    }
}

class Books {
    private String name;
    private String name2;
    private String name3;
    private static final String author = "STEPHEN_KING";
    private static int pagesDark;
    private static int pagesIt;
    private static int pagesShining;

    public int flipPage(int a, int b) {
        int page = 0;
        if (a == 5) {
            page += a;
            System.out.println("Вы читаете " + page);
        } else if (a < b) {
            page += b;
            System.out.println("Вы читаете " + page);
        }
        return page;
    }

    public int chapterListRet(int a, int b) {
        a = 1;
        b = 100;
        if (a == 1) {
            return a;
        } else {
            System.out.println("Перенажмите страницу");
            return b;
        }
    }

    public int definingChapter(int a, int b, int c, int d) {
        a = 10;
        b = 20;
        c = 30;
        d = 40;
        if (a == 0 && a <= 10) {
            System.out.println("Вы читаете первую главу");
        } else if (b > a && b <= c) {
            System.out.println("Вы читаете вторую главу");
        } else if (c > b && c <= d) {
            System.out.println("Вы читаете третью главу");
        } else {
            System.out.println("Вы читаете четвертую главу");
        }
        return a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public static String getAuthor() {
        return author;
    }

    public static int getPagesDark() {
        return pagesDark;
    }

    public static void setPagesDark(int pagesDark) {
        Books.pagesDark = pagesDark;
    }

    public static int getPagesIt() {
        return pagesIt;
    }

    public static void setPagesIt(int pagesIt) {
        Books.pagesIt = pagesIt;
    }

    public static int getPagesShining() {
        return pagesShining;
    }

    public static void setPagesShining(int pagesShining) {
        Books.pagesShining = pagesShining;
    }
}

class PostOffice {
    private static String name;
    private static String name2;
    private static String name3;
    private static int clientsNewPost;
    private static int clientsUkr;
    private static int clientsJustin;

    public static int calcMass(int a, int b, int c) {
        System.out.println("Объёмный вес вашей посылки = кг ");
        return a * b * c;
    }

    public int receivingList(int a, int b) {
        return a + b;
    }

    public int packingShipping(int a, int b) {
        if (a == 1) {
            System.out.println("Ваша посылка весом 1 кг, отправка 10$");
        } else if (a == 2) {
            System.out.println("Ваша посылка больше 1 кг, отправка 10$ + 20$");
            return a + b;
        } else {
            System.out.println("Ваша посылка тяжелая, заплатите пожалуйста 4 кратную сумму");
            return a * b;
        }
        return a + b;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        PostOffice.name = name;
    }

    public static String getName2() {
        return name2;
    }

    public static void setName2(String name2) {
        PostOffice.name2 = name2;
    }

    public static String getName3() {
        return name3;
    }

    public static void setName3(String name3) {
        PostOffice.name3 = name3;
    }

    public static int getClientsNewPost() {
        return clientsNewPost;
    }

    public static void setClientsNewPost(int clientsNewPost) {
        PostOffice.clientsNewPost = clientsNewPost;
    }

    public static int getClientsUkr() {
        return clientsUkr;
    }

    public static void setClientsUkr(int clientsUkr) {
        PostOffice.clientsUkr = clientsUkr;
    }

    public static int getClientsJustin() {
        return clientsJustin;
    }

    public static void setClientsJustin(int clientsJustin) {
        PostOffice.clientsJustin = clientsJustin;
    }
}

class Market {
    private static String name;
    private static String name2;
    private static String name3;
    private static final int CLIENTS_SILPO = 10000;
    private static int clientsVarus;
    private int clientsATB;

    public void addBin() {
        System.out.println("Возьмите корзину с полки и наполняйте её по мере необходимости товарами");
    }

    public int viewBonus(int a) {
        System.out.println("У вас " + a + " накопленных бонусов");
        return a * a;
    }

    public String buyProduct(String cart, String cash) {
        int a = 10;
        int b = 100;
        if (a <= 10) {
            return cash;
        } else {
            return cart;
        }
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Market.name = name;
    }

    public static String getName2() {
        return name2;
    }

    public static void setName2(String name2) {
        Market.name2 = name2;
    }

    public static String getName3() {
        return name3;
    }

    public static void setName3(String name3) {
        Market.name3 = name3;
    }

    public static int getClientsSilpo() {
        return CLIENTS_SILPO;
    }

    public static int getClientsVarus() {
        return clientsVarus;
    }

    public static void setClientsVarus(int clientsVarus) {
        Market.clientsVarus = clientsVarus;
    }

    public int getClientsATB() {
        return clientsATB;
    }

    public void setClientsATB(int clientsATB) {
        this.clientsATB = clientsATB;
    }
}
