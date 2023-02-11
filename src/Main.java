public class Main {
    public static void main(String[] args) {
        Authur authur1 = new  Authur("Ivan", "Ivanov");
        Authur authur2 = new Authur("Petr", "Petrov");
        Book book1 = new Book("book1", 1990, authur1);
        Book book2 = new Book("book2", 1899, authur2 );
        System.out.println(book1);
        System.out.println(book2);



    }
}