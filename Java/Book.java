public class Book {
    private String bookID;
    private String bookName;
    private String author;
    private boolean isIssue;

    //constructor:
    public Book(String bookId, String bookName, String author){
        this.bookID = bookId;
        this.bookName=bookName;
        this.author=author;
        isIssue=false;
    }

    //setter and getter methods 
    public String getBookId(){
        return bookID;
    }
    public void setBookId(String bookId){
        this.bookID=bookId;
    }

    public String getBookName(){
        return bookName;
    }
    public void setBookName(String bookName){
        this.bookName=bookName;
    }

    public String getBookAuthor(){
        return author;
    }
    public void setBookAuthor(String author){
        this.author=author;
    }

    public boolean getIsIssue(){
        return isIssue;
    }
    public void setIsIssue(boolean isIssue){
        this.isIssue=isIssue;
    }
    


    //methods to display
    public void bookInfo(){
        System.out.println("Book ID= " +bookID);
        System.out.println("Book Name= " +bookName);
        System.out.println("Book Author= " +author);
        System.out.println("isIssue status= " +isIssue);
        
    }
}
