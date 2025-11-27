package gestionMagasin;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ranim
 */
public class Commande {
    private static int compteurCommande = 1000;
    private int idCommande;
    private Client client;
    private List<Produit> produitsCommandes;
    private double total;
    public Commande(Client client, List<Produit> produitsCommandes) {
        this.idCommande = ++compteurCommande;
        this.client = client;
        this.produitsCommandes = new ArrayList<>(produitsCommandes);
        this.total = calculerTotal();
    }
    private double calculerTotal() {
        double somme = 0;
        for (Produit produit : produitsCommandes) {
            somme += produit.getPrix();
        }
        return somme;
    }
    public void afficherDetailsCommande() {
        System.out.println("Commande N: " + idCommande);
        System.out.println("\nInformations Client");
        client.afficherDetails();
        
        System.out.println("\nProduits commandes");
        for (int i = 0; i < produitsCommandes.size(); i++) {
            System.out.print((i + 1) + ". ");
            produitsCommandes.get(i).afficherDetails();
        }
        System.out.println("TOTAL A PAYER: " + total);
    }
    

}
