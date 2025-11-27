package gestionMagasin;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Magasin magasin = new Magasin();
        Panier panier = new Panier();
        Client client = null;
        
        System.out.println("=== MAGASIN EN LIGNE ===\n");
        
        magasin.ajouterProduit(new Produit(1, "Ordinateur Portable", 900, 5));
        magasin.ajouterProduit(new Produit(2, "Souris", 30, 10));
        magasin.ajouterProduit(new Produit(3, "Clavier", 80, 8));
        magasin.ajouterProduit(new Produit(4, "Ecran", 200, 6));
        magasin.ajouterProduit(new Produit(5, "Casque", 50, 12));
        
        System.out.print("Entrez votre nom: ");
        String nom = scanner.nextLine();
        System.out.print("Entrez votre email: ");
        String email = scanner.nextLine();
        client = new Client(1, nom, email);
        System.out.println("\nBienvenue " + nom + "!\n");
        
        boolean continuer = true;
        
        while (continuer) {
            System.out.println("--- Menu Magasin ---");
            System.out.println("1. Afficher les produits disponibles");
            System.out.println("2. Ajouter un produit au panier");
            System.out.println("3. Afficher le panier");
            System.out.println("4. Passer la commande");
            System.out.println("5. Quitter");
            System.out.print("Votre choix: ");
            
            int choix = scanner.nextInt();
            scanner.nextLine();
            
            switch (choix) {
                case 1:
                    System.out.println();
                    magasin.afficherProduitsDisponibles();
                    System.out.println();
                    break;
                    
                case 2:
                    System.out.print("Entrez l'ID du produit: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    
                    Produit produit = magasin.trouverProduitParNom("");
                    boolean trouve = false;
                    
                    for (Produit p : magasin.getProduits()) {
                        if (p.getId() == id) {
                            panier.ajouterProduit(p);
                            trouve = true;
                            break;
                        }
                    }
                    
                    if (!trouve) {
                        System.out.println("Produit non trouve.");
                    }
                    System.out.println();
                    break;
                    
                case 3:
                    panier.afficherPanier();
                    System.out.println();
                    break;
                    
                case 4:
                    if (panier.estVide()) {
                        System.out.println("Votre panier est vide.\n");
                    } else {
                        Commande commande = new Commande(client, panier.getProduits());
                        commande.afficherDetailsCommande();
                        panier.viderPanier();
                        System.out.println("Commande validee!\n");
                    }
                    break;
                    
                case 5:
                    System.out.println("Au revoir!");
                    continuer = false;
                    break;
                    
                default:
                    System.out.println("Choix invalide.\n");
            }
        }
        
        scanner.close();
    }
}