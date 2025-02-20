import java.util.ArrayList;

public class packet{
    private ArrayList<book> titres = new ArrayList<>();

    public packet(){
        this.titres= new ArrayList<>();
    }



    public void add_book(book livre ){
        this.titres.add(livre);
    }

    public void show_books(){
        for(book livre : this.titres){
             livre.caracteristiques();        }
    }

    public int findBook(String search, String auteur, int annee) {
        for (book livre : this.titres) {
            if (livre.get_auteur().equals(auteur) &&
                livre.get_titre().equals(search) &&
                livre.get_annee() == annee) {
                return this.titres.indexOf(livre);
            }
        }
        return -1; // Retourne -1 si le livre n'est pas trouvé
    }

}