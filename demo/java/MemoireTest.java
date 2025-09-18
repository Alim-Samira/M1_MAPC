// Importing JUnit Test annotation to mark this method as a test
import org.junit.jupiter.api.Test;
// Importing the 'assertEquals' method from JUnit to compare expected and actual results
import static org.junit.jupiter.api.Assertions.assertEquals;
// Importing utility classes to work with arrays and lists
import java.util.Arrays;
import java.util.List;

// Test class for Memoire
public class MemoireTest {

    // This annotation marks the following method as a test method
    @Test
    public void testMemoireTaille() {
        
        // Create 'Chapitre' objects (chapters) with different numbers of pages
        // 'Chapitre' is the chapter name, and 'Arrays.asList' creates a list of pages
        Chapitre chap1 = new Chapitre("Introduction", Arrays.asList("Page1", "Page2"));
        Chapitre chap2 = new Chapitre("Patrons", Arrays.asList("Page1", "Page2", "Page3"));
        Chapitre chap3 = new Chapitre("Anti-Patrons", Arrays.asList("Page1", "Page2"));
        Chapitre chap4 = new Chapitre("Conclusion", Arrays.asList("Page1"));
        
        // Create a list of 'Chapitre' objects using 'Arrays.asList'
        List<Chapitre> chapitres = Arrays.asList(chap1, chap2, chap3, chap4);

        // Create a 'Memoire' (thesis) object and pass the list of chapters to it
        // 'Memoire' is initialized with the title and a list of 'Chapitre' objects
        Memoire memoire = new Memoire("Patrons et Anti-Patrons", chapitres);

        // The actual test to compare the expected and actual size of the 'Memoire'
        // The 'taille()' method of 'Memoire' should return the total size of all pages
        // We are expecting 7 pages (but this is incorrect as the correct value is 8)
        assertEquals(7, memoire.taille(), "La taille du mémoire devrait être 7 (mais est fausse)");
        // The 'assertEquals' method compares the first argument (expected value) with the second argument (actual value)
        // If the values are not equal, the test will fail and print the error message given as the third argument
    }
}
