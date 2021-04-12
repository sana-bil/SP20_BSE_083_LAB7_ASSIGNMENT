public class BookRunner {
    public static void main(String[] args) {
        Address address = new Address(1,55 , "Rawalpindi", 8);
        Person author = new Person("Sanabil", "author", "islam", address);
        Book book = new Book(author, "anne with an e", "WentWorth Miller");
        System.out.println("                  BOOK DETAILS    ");
        book.display();
    }
}
