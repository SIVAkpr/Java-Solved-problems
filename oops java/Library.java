import java.util.*;

class Book {
    private String title;
    private String author;
    private String isbn;
    private static ArrayList<Book> BOOKcollection = new ArrayList<Book>();

    Book(String title1, String author1, String isbn1) {
        this.title = title1;
        this.author = author1;
        this.isbn = isbn1;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    String getIsbn() {
        return isbn;
    }

    public void setTitle(String title2) {
        this.title = title2;
    }

    public void setAuthor(String author2) {
        this.author = author2;
    }

    public void setIsbn(String isbn2) {
        this.isbn = isbn2;
    }

    public static void addbook(Book book) {
        BOOKcollection.add(book);
    }

    public static void removebook(Book book) {
        BOOKcollection.remove(book);
    }

    public static ArrayList<Book> get_BookCollection() {
        return BOOKcollection;
    }
}

public class Library {
    // static ArrayList<Book> bookcollection = new ArrayList<Book>();
    static int k = 0;

    public static int findbook(String fnd) {
        int fd = 0;
        ArrayList<Book> bookCollection = Book.get_BookCollection();
        for (Book b : bookCollection) {
            if ((fnd.equals(b.getTitle())) || (fnd.equals(b.getAuthor()))
                    || (fnd.equals(b.getIsbn()))) {
                fd = 1;
            }
        }
        if (fd == 1) {
            return 1;
        } else {
            return fd;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> bookCollection = Book.get_BookCollection();
        System.out.println("Please enter your choice");
        while (true) {
            System.out.println("-----------------------------");
            System.out.println(
                    "--- MAIN MENU ---\n1.Add Books\n2.View books list \n3.Alter Book Details \n4.Find books.\n5.exit\n");
            System.out.println("-----------------------------");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.print("Enter no. of books to add: ");
                    int n = sc.nextInt();
                    System.out.println("-----------------------------");
                    sc.nextLine();
                    for (int i = 1; i <= n; i++) {
                        System.out.print("\nEnter book " + i + " title: ");
                        String tit = sc.nextLine();
                        System.out.print("\nEnter book " + i + " author: ");
                        String auth = sc.nextLine();
                        System.out.print("\nEnter book " + i + " ISBN: ");
                        String isbn = sc.nextLine();
                        Book neww = new Book(tit, auth, isbn);
                        Book.addbook(neww);
                    }
                    System.out.println("-----------------------------\n");
                    break;
                case 2:
                    System.out.println("-----------------------------");
                    System.out.println("List of books:");
                    for (Book b : bookCollection) {
                        k++;
                        System.out.println(
                                k + ">> \"" + b.getTitle() + "\" by \"" + b.getAuthor() + "\" ISBN :" + b.getIsbn());
                    }
                    System.out.println("-----------------------------\n");
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Entered Book Alter Section\nEnter ISBN no to alter");
                    String acc = sc.nextLine();
                    for (Book b : bookCollection) {
                        if (acc.equals(b.getIsbn())) {
                            System.out.println("What do you what to change: ");
                            System.out.println("Book title or Book author say(T/A)");
                            String cha = sc.nextLine();
                            if (cha.equals("T")) {
                                System.out.println("Enter New Title to change ");
                                String Tchange = sc.nextLine();
                                for (Book bo : bookCollection) {
                                    if ((acc.equals(bo.getIsbn()))) {
                                        System.out.print(">>The Book title \"" + bo.getTitle() + "\" is changed to ");
                                        bo.setTitle(Tchange);
                                        System.out.print("\"" + bo.getTitle() + "\"\n");
                                        break;
                                    }
                                }
                            } else if (cha.equals("A")) {
                                System.out.println("Enter New Author to change ");
                                String Achange = sc.nextLine();
                                for (Book bo : bookCollection) {
                                    if ((acc.equals(bo.getIsbn()))) {
                                        System.out
                                                .print(">>The Author of Book \"" + bo.getTitle() + "\" is changed to ");
                                        bo.setAuthor(Achange);
                                        System.out.print("\"" + bo.getAuthor() + "\"\n");
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Enter book 1.TITLE or 2.AUTHOR or 3.ISBN no:)");
                    String fnd = sc.nextLine();
                    int no = findbook(fnd);
                    if (no == 1) {
                        System.out.println("Yes book is AVAILABLE");
                    } else {
                        System.out.println("Entered book is not available:");
                    }

                    break;

                case 5:
                    System.out.println("-----------------------------");
                    System.out.println("Thanks for visiting");
                    System.out.println("-----------------------------");
                    sc.close();
                    return;
                default:
                    System.out.println("-----------------------------");
                    System.out.println("INVALID choice");
                    System.out.println("-----------------------------");
            }
        }

    }

}