public class Book {
    private Person author;
    private String bookName;
    private String publisher;
    public Book(Person author,String bookName, String publisher){
        this.author=author;
        this.bookName=bookName;
        this.publisher=publisher;
    }
    public void setBookName(String bookName){
        this.bookName=bookName;
    }
    public String getBookName(){
        return bookName;
    }
    public void setPublisher(String publisher){
        this.publisher=publisher;
    }
    public String getPublisher(){
        return publisher;
    }
    public void display(){
        System.out.println("AUTHOR DETAILS : ");
        author.display();
        System.out.println();
        System.out.println("BOOK NAME : "+bookName);
        System.out.println("PUBLISHER NAME: "+ publisher);
    }

}
