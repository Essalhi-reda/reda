public class Produit {
    private String nomProduit;
    private double prixProduit;
    // Constructeur nécessaire pour créer de nouveaux produits.
    public Produit(String nomProduit, double prixProduit){
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
    }
   // la 1ere methode : affichage de prix de produit
    public double getPrixProduit() {
        return prixProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setPrixProduit(double prixProduit) {
        this.prixProduit = prixProduit;
    }
}

