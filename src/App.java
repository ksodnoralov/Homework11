public class App {

    public static void main(String[] args) {

        Book firstBook = new Book("Алые паруса", "Александр Грин", 1923);
        Book secondBook = new Book("Момент истины", "Владимир Богомолов", 1974);

        Author writer1 = new Author("Анн", "Голон");
        Author writer2 = new Author("Аньес", "Мартен-Люган");

        System.out.println("firstBook.getBookName() = " + firstBook.getBookName());
        System.out.println("firstBook.getAuthor() = " + firstBook.getAuthor());
        System.out.println("firstBook.getPublisherYear() = " + firstBook.getPublisherYear());

        System.out.println("secondBook.getBookName() = " + secondBook.getBookName());
        System.out.println("secondBook.getAuthor() = " + secondBook.getAuthor());
        System.out.println("secondBook.getPublisherYear() = " + secondBook.getPublisherYear());

        System.out.println("writer1.getAuthorName() = " + writer1.getAuthorName());
        System.out.println("writer1.getAuthorSurname() = " + writer1.getAuthorSurname());

        System.out.println("writer2.getAuthorName() = " + writer2.getAuthorName());
        System.out.println("writer2.getAuthorSurname() = " + writer2.getAuthorSurname());

        firstBook.setPublisherYear(1931);
        System.out.println("firstBook.getPublisherYear() = " + firstBook.getPublisherYear());


    }
}
