package Basic_problems;

/**
 * Write a Java program to create an interface Searchable
 * with a method search(String keyword) that searches for a given keyword in a text document.
 * Create two classes Document and WebPage that
 * implement the Searchable interface and provide their own implementations of the search() method
 */
public class SearchInterface {
    public static void main(String[] args) {
        var doc=new Document("How are youuu");
        System.out.println(doc.search("are"));
        System.out.println(doc.search("shit"));
    }
}

interface Searchable{
    boolean search(String key);
}

class Document implements Searchable{
    String contents;

    public Document(String contents) {
        this.contents = contents;
    }

    @Override
    public boolean search(String key) {
        return contents.contains(key);
    }
}

class Web implements Searchable{
    String Url;

    public Web(String url) {
        Url = url;
    }

    @Override
    public boolean search(String key) {
        return Url.contains(key);
    }
}
