package basic_problems;

/**
 * Implement a Book class with a constructor
 * that initializes title and pageCount,
 * then create and display a few book objects.
 */
public class Books {
    public static void main(String[] args) {
        Book b1=new Book("Cs",12);
        Book b2=new Book("DSA",1000);
        b1.display();
        b2.display();

    }
}
class Book{
    String title;
    int pageCount;

    public Book(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

    public Book(String title) {
        this.title = title;
    }

    public Book(int pageCount) {
        this.pageCount = pageCount;
    }

    void display(){
        System.out.println("Title: "+title+" <-|||-> Page: "+pageCount+" ");
        System.gc();
    }
}

