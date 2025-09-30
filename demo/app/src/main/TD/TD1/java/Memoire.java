import java.util.List;

public class Memoire implements Document {
    private String titre;
    private List<Chapitre> cs;

    public Memoire(String titre, List<Chapitre> cs) {
        this.titre = titre;
        this.cs = cs;
    }

    @Override
    public String titre() {
        return this.titre;
    }

    @Override
    public int taille() {
        int totalSize = 0;
        for (Chapitre chapitre : cs) {
            totalSize += chapitre.taille();
        }
        return totalSize;
    }
}
