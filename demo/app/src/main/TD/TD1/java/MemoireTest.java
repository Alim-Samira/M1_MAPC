import java.util.Arrays;
import java.util.List;

public class MemoireTest {

    public static void main(String[] args) {
        // Run the test
        testMemoireTaille();
    }

    public static void testMemoireTaille() {
        
        // Create 'Chapitre' objects (chapters) with different numbers of pages
        Chapitre chap1 = new Chapitre("Introduction", Arrays.asList("Page1", "Page2"));
        Chapitre chap2 = new Chapitre("Patrons", Arrays.asList("Page1", "Page2", "Page3"));
        Chapitre chap3 = new Chapitre("Anti-Patrons", Arrays.asList("Page1", "Page2"));
        Chapitre chap4 = new Chapitre("Conclusion", Arrays.asList("Page1"));
        
        // Create a list of 'Chapitre' objects
        List<Chapitre> chapitres = Arrays.asList(chap1, chap2, chap3, chap4);

        // Create a 'Memoire' (thesis) object
        Memoire memoire = new Memoire("Patrons et Anti-Patrons", chapitres);

        // Get the actual size
        int actualSize = memoire.taille();
        int expectedSize = 8; // This is the correct expected value

        // Use an assertion to verify the expected and actual size
        assert actualSize == expectedSize : "La taille du mémoire devrait être " + expectedSize + " mais est " + actualSize;
        
        // If the assertion passes, print a success message
        System.out.println("Test Passed! The size of the Memoire is correct: " + actualSize);
    }
}
