package Personne;

import java.time.LocalDate;

/**
 *
 * @author Ranim
 */

public class Personne { 
    private String nom;
    private String prenom;
    private int anNaissance;
    
    private static int nbPersonnes = 0;

    
    public Personne(String nom, String prenom, int anNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.anNaissance = anNaissance;
        
         nbPersonnes++;
         afficherNbPers(); 
    }
    
    
    public Personne(String prenom, int anNaissance) {
        this.nom = "Inconnu";
        this.prenom = prenom;
        this.anNaissance = anNaissance;
        
        
        nbPersonnes++;
         afficherNbPers(); 
    }
    
    
    public Personne() {
        this("Potter", "Harry", 1980); 
    }
    
    
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAnNaissance() {
        return anNaissance;
    }
    

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAnNaissance(int anNaissance) {
        this.anNaissance = anNaissance;
    }
    
        
    public int calculerAge() {
        int anneeActuelle = LocalDate.now().getYear();
        return anneeActuelle - anNaissance;
    }
    
   
    public void afficherInfos() {
        System.out.println("Nom : " + nom);
        System.out.println("PrÃ©nom : " + prenom);
        System.out.println("Ã‚ge : " + calculerAge());
    }
    
    
    public void mange(String aliment) {
        System.out.println(nom + " " + prenom + " mange un/une " + aliment);
    }
    
       public static void afficherNbPers() {
        System.out.println("Nombre total de personnes crÃ©Ã©es : " + nbPersonnes);
    }
     public static boolean isBissextile(int annee) {
        return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
    }
    
    
    public static void afficherNombresPremiers(int annee) {
        System.out.println("\nNombres premiers inférieurs ou égaux à " + annee + " :");
        for (int i = 2; i <= annee; i++) {
            if (estPremier(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }
    
    
    private static boolean estPremier(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    
    
    public static boolean isPalindrome(String chaine) {
        String clean = chaine.toLowerCase().replaceAll("\\s+", "");
        int longueur = clean.length();
        for (int i = 0; i < longueur / 2; i++) {
            if (clean.charAt(i) != clean.charAt(longueur - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public void testerPalindromes() {
        System.out.println("\n=== Test des palindromes pour " + prenom + " " + nom + " ===");
        System.out.println("Le nom '" + nom + "' est un palindrome : " + isPalindrome(nom));
        System.out.println("Le prénom '" + prenom + "' est un palindrome : " + isPalindrome(prenom));
        System.out.println("L'année '" + anNaissance + "' est un palindrome : " + isPalindrome(String.valueOf(anNaissance)));
    }

    
}