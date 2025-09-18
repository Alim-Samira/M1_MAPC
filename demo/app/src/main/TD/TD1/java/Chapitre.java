// Importing the List class from java.util package for working with lists.
import java.util.List;

// Chapitre class implements Document, which means it must provide the implementation of the methods defined in the Document interface.
public class Chapitre implements Document {
    // Instance variable to store the title of the chapter.
    private String titre;

    // Instance variable to store the list of pages in the chapter.
    private List<String> pages;

    // Constructor to initialize the title and the pages.
    public Chapitre(String titre, List<String> pages) {
        this.titre = titre;  // Initialize title.
        this.pages = pages;  // Initialize list of pages.
    }

    // Implementation of the titre method from the Document interface.
    @Override
    public String titre() {
        return this.titre;  // Return the title of the chapter.
    }

    // Implementation of the taille method from the Document interface.
    @Override
    public int taille() {
        return pages.size();  // Return the number of pages in the chapter (size of the list of pages).
    }
}
