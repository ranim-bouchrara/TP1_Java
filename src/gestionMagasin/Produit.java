package gestionMagasin;

/**
 *
 * @author Ranim
 */
public class Produit {
    private int id;
    private String nom;
    private double prix;
    private int quantite;
    
    // Constructeur
    public Produit(int id, String nom, double prix, int quantite) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }
    //getters
    public int getId() {
        return id;
    }
    
    public String getNom() {
        return nom;
    }
    
    public double getPrix() {
        return prix;
    }
    
    public int getQuantite() {
        return quantite;
    }
    
    // Setters
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setPrix(double prix) {
        this.prix = prix;
    }
    
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    
    public void afficherDetails() {
        System.out.println("ID: " + id + " | Nom: " + nom + 
                         " | Prix: " + prix + "|Quantite: " + quantite);
    }
}
