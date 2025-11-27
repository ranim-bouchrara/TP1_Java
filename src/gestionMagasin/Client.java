package gestionMagasin;

/**
 *
 * @author Ranim
 */
public class Client {
    private int id;
    private String nom;
    private String email;
    
    public Client(int id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }
    //getters
    public int getId() {
        return id;
    }
    
    public String getNom() {
        return nom;
    }
    
    public String getemail() {
        return email;
    }
    
    // Setters
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setEmail(String email) {
        this.email = email;
    }
        public void afficherDetails() {
        System.out.println("ID Client: " + id);
        System.out.println("Nom: " + nom);
        System.out.println("Email: " + email);
    }
}
