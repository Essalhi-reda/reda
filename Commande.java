import java.util.ArrayList;

public class Commande {
    private double totalCommande;
    private double fraisLivraison;
    private double remise;
    // Une liste contenant tous les produits de la commande.
    private ArrayList<Produit> listeProduits;

    // Constructeur nécessaire pour créer une nouvelle commande.
    public Commande(){
        // Initialise listeProduits à une liste vide.
        this.listeProduits = new ArrayList<>();
        this.totalCommande = calculerTotalCommandeAvantRemise();
        this.fraisLivraison = calculerFraisLivraison();
        this.remise = calculerRemise();
    }

    public void ajouterProduit(Produit produit){
        this.listeProduits.add(produit);
        // Répercussion sur les variables de la classe
        this.totalCommande = calculerTotalCommandeAvantRemise();
        this.fraisLivraison = calculerFraisLivraison();
        this.remise = calculerRemise();
    }

    public double calculerTotalCommandeAvantRemise(){
        double totalCommande = 0;
        for(Produit produit : this.listeProduits){
            totalCommande += produit.getPrixProduit();
        }
        return totalCommande;
    }

    public double calculerRemise(){
        double remisePourcent = 0.0f;

        if (this.totalCommande > 1000){
            remisePourcent = 10.0f;
        } else if (this.totalCommande > 500){
            remisePourcent = 5.0f;
        }
        remise = this.totalCommande*(remisePourcent/100);
        return remise;
    }

    public double calculerFraisLivraison(){
        double fraisLivraison = 0;
        if (this.totalCommande < 100){
            fraisLivraison = 0.05 * this.totalCommande;
        }
        return fraisLivraison;
    }

    public double calculerTotalCommandeAvecRemiseEtLivraison(){
        double totalCommandePostRemise = this.totalCommande * (1-(this.remise/100));

        return totalCommandePostRemise + this.fraisLivraison;

    }
    public double heritage(){
        this.totalCommande+=1;
        return this.totalCommande;
    }


}
