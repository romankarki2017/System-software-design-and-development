import java.util.Scanner;
public class Library {
    static Book[] booklist; //declaring the array variable of Book type.
    static Scanner sc;

    public static void main(String[] args){
        sc = new Scanner(System.in);
        int choice;

        do{
        System.out.println("Press 1: To add books");
        System.out.println("Press 2: To delete the book");
        System.out.println("Press 3: To display the books");
        System.out.println("press 0: to exit ");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                //call the methods to add the books
                addBooks();
                break;
            case 2:
                //call the methods to delete the books
                deleteBooks();
                break;
            case 3:
                //call the methods to display
                displayBooks();
                break;
            default:
                System.out.println("Invalid Input");
        }
        }while(choice !=0);
        
    }

    //method to add the books
    public static void addBooks(){
        System.out.println("books adding .............");
        System.out.println("Enter the number of book to be added: ");
        int n=sc.nextInt();
        sc.nextLine(); 
        booklist=new Book[n]; //array construction
        for(int i=0; i<n; i++){
            System.out.println("Enter book Id: ");
            String bookId=sc.nextLine();

            System.out.println("Enter book name: ");
            String bookName=sc.nextLine();

            System.out.println("Enter Author Id: ");
            String author=sc.nextLine();

            Book b=new Book(bookId, bookName, author);
            booklist[i]=b;
            System.out.println(b.getBookId());
        }

    }

     //method to delete the books
    public static void deleteBooks(){
        System.out.println("deleting adding .............");
    }
     //method to display the books
    public static void displayBooks(){
        System.out.println("display adding .............");
    }
}
