// Importing the List class from java.util package for working with lists.
import java.util.List;

// Mémoire class implements Document, which means it must provide the implementation of the methods defined in the Document interface.
public class Mémoire implements Document {
    // Instance variable to store the title of the memory (document).
    private String titre;

    // Instance variable to store the chapters (List of Chapitre objects).
    private List<Chapitre> cs;

    // Constructor to initialize the title and the list of chapters.
    public Mémoire(String titre, List<Chapitre> cs) {
        this.titre = titre;  // Initialize title.
        this.cs = cs;        // Initialize list of chapters.
    }

    // Implementation of the titre method from the Document interface.
    @Override
    public String titre() {
        return this.titre;  // Return the title of the document.
    }

    // Implementation of the taille method from the Document interface.
    @Override
    public int taille() {
        // Initialize total size to 0.
        int totalSize = 0;

        // Loop through each chapter (Chapitre) and sum their sizes.
        for (Chapitre chapitre : cs) {
            totalSize += chapitre.taille();  // Add the size of each chapter.
        }

        // Return the total size of the document.
        return totalSize;
    }
}
