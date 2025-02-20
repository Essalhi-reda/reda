public class book{


    private String titre;
    private String auteur;
    private int  annee;

    public book(String titre , String auteur , int annee){
    this.titre=titre;
    this.auteur=auteur;
    this.annee=annee;
    }

    void caracteristiques(){
        System.out.println(" the name of the book is " + this.titre + "the auteur is " + this.auteur+"la date est "+String.valueOf(annee));
    }

    public String get_titre(){
        return this.titre;
    }
    public String get_auteur(){
        return this.auteur;
    }
    public int get_annee(){
        return this.annee;
    }
    public class journal{
        private int date_de_parution ; 
        

    }

}