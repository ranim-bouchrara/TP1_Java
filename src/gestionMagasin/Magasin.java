package gestionMagasin;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ranim
 */
public class Magasin {
    private List<Produit> produits;
    
    // Constructeur
    public Magasin() {
        this.produits = new ArrayList<>();
    }
    
    // Méthode pour ajouter un produit au magasin
    public void ajouterProduit(Produit produit) {
        produits.add(produit);
        System.out.println("Produit '" + produit.getNom() + "' ajoute au magasin.");
    }
    public void afficherProduitsDisponibles() {
        if (produits.isEmpty()) {
            System.out.println("Aucun produit disponible pour le moment.");
            return;
        }
        for (int i = 0; i < produits.size(); i++) {
            System.out.print((i + 1) + ". ");
            produits.get(i).afficherDetails();
        }
    }
    public Produit trouverProduitParNom(String nom) {
        for (Produit produit : produits) {
            if (produit.getNom().equalsIgnoreCase(nom)) {
                return produit;
            }
        }
        return null;
    }
    public List<Produit> getProduits() {
    return produits;
}
}
