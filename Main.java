public class Main {
    public static void main(String[] args){

        // Création de nos produits.
        Produit p1 = new Produit("Ordinateur",800);
        Produit p2 = new Produit("Clavier",50);
        Produit p3 = new Produit("Souris",50);

        //Création d'une commande et ajout de nos produits.
        Commande com = new Commande();
        com.ajouterProduit(p1);
        com.ajouterProduit(p2);
        com.ajouterProduit(p3);

        System.out.println("Total avant remise: "+ com.calculerTotalCommandeAvantRemise() + "€");
        System.out.println("Remise: " + com.calculerRemise() + "€");
        System.out.println("Frais de livraison: " + com.calculerFraisLivraison() + "€");
        System.out.println("Total avec remise et frais de livraison: "+ com.calculerTotalCommandeAvecRemiseEtLivraison() + "€");
        System.out.println();
    }
}
