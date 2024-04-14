class Reader{
    String name;
    int ticketNum;
    String faculty;
    String birthdate;
    String phoneNum;
    Reader(String name, int ticketNum, String faculty, String birthdate, String phoneNum){
        this.name = name;
        this.ticketNum = ticketNum;
        this.faculty = faculty;
        this.birthdate = birthdate;
        this.phoneNum = phoneNum;
    }
    public void takeBook(int books){
        System.out.printf("%s взял(-а) %d книг \n", name, books);
    }
    public void takeBook(String... booksName){
        System.out.println(name + " взял книги: ");
        for (String book : booksName){
            System.out.print(book + "; ");
            System.out.println();
        }
    }
    public void returnBook(int books){
        System.out.printf("%s вернул %d книг \n", name, books);
    }
    public void returnBook(String... booksName){
        System.out.println(name + " вернул книги: ");
        for (String book : booksName){
            System.out.print(book + "; ");
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Reader[] readers = {
                new Reader("Доля Канькин", 5001, "Программирование", "22.03.2007", "89876543210"),
                new Reader("Коля Данькин", 5002, "Наладка мучной продукции", "02/05/2007", "+79538492867"),
                new Reader("Даня Колькин", 5003, "Техническая поддержка стиральных машин", "01/08/2006", "+79535890275"),
                new Reader("Каля Донькин", 5004, "Дальнобойщик", "01/04/2005", "+79538592056"),
                new Reader("Стасик", 5005, "Разработка и модулирование яичницы", "30/08/2005", "+79535792534")
        };
        readers[0].returnBook("Программирование для дураков");
        readers[1].takeBook("Тесто. Всё о тесте и немного о батарейках");
        readers[3].returnBook(354);
    }
}