package gestionMagasin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ranim
 */
public class Panier {
    private List<Produit> produits;
    public Panier() {
        this.produits = new ArrayList<>();
    }
    
    public void ajouterProduit(Produit produit) {
        produits.add(produit);
        System.out.println("Produit" + produit.getNom() + "ajoute au panier.");
    }
    
    public void supprimerProduit(Produit produit) {
        if (produits.remove(produit)) {
            System.out.println("Produit supprime du panier.");
        } else {
            System.out.println("Produit non trouve dans le panier.");
        }
    }
    
    public void afficherPanier() {
        if (produits.isEmpty()) {
            System.out.println("Votre panier est vide.");
            return;
        }
        
        System.out.println("\nContenu du panier");
        for (int i = 0; i < produits.size(); i++) {
            System.out.print((i + 1) + ". ");
            produits.get(i).afficherDetails();
        }
        System.out.println("Total: " + calculerTotal());
    }
    
    public double calculerTotal() {
        double total = 0;
        for (Produit produit : produits) {
            total += produit.getPrix();
        }
        return total;
    }
    
    public List<Produit> getProduits() {
        return new ArrayList<>(produits);
    }
    
    public void viderPanier() {
        produits.clear();
    }
    public boolean estVide() {
        return produits.isEmpty();
    }
}
