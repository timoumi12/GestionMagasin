package models;

public class Magasinne {
    private int id;
    private String adresse;
    private int capacite;
    private Produit[] produits;
    private int nombreProduits;

    private static int nombreTotalProduits = 0;
    private static int nombreMagasins = 0;

    public Magasinne(int id, String adresse, int capacite) {
        this.id = id;
        this.adresse = adresse;
        this.capacite = capacite;
        this.produits = new Produit[50];
        this.nombreProduits = 0;
        nombreMagasins++;
    }

    public boolean ajouterProduit(Produit produit) {
        if (nombreProduits < produits.length) {
            produits[nombreProduits] = produit;
            nombreProduits++;
            nombreTotalProduits++;
            return true;
        }
        return false;
    }

    public void afficherCaracteristiques() {
        System.out.println("Magasinne{" +
                "id=" + id +
                ", adresse='" + adresse + '\'' +
                ", capacite=" + capacite +
                '}');
        System.out.println("Produits:");
        for (int i = 0; i < nombreProduits; i++) {
            System.out.println("- " + produits[i].getLibelle() + " : " + produits[i].getPrix());
        }
    }

    public static int getNombreTotalProduits() {
        return nombreTotalProduits;
    }

    public static int getNombreMagasins() {
        return nombreMagasins;
    }

    public boolean chercherProduit(Produit produit) {
        for (int i = 0; i < nombreProduits; i++) {
            if (produits[i].comparer(produit)) {
                return true;
            }
        }
        return false;
    }

    public boolean ajouterProduit2(Produit produit) {
        for (int i = 0; i < nombreProduits; i++) {
            if (produits[i].comparer(produit)) {
                System.out.println("Le produit est déjà présent dans le magasin.");
                return false;
            }
        }

        if (nombreProduits < produits.length) {
            produits[nombreProduits] = produit;
            nombreProduits++;
            nombreTotalProduits++;
            return true;
        }

        System.out.println("Le magasin est plein, impossible d'ajouter de nouveaux produits.");
        return false;
    }

    public static Magasinne magasinAvecPlusDeProduits(Magasinne m1, Magasinne m2) {
        if (m1.nombreProduits > m2.nombreProduits) {
            return m1;
        } else if (m2.nombreProduits > m1.nombreProduits) {
            return m2;
        } else {
            System.out.println("Les deux magasins ont le même nombre de produits.");
            return null; // Retourne null si les deux ont le même nombre de produits
        }
    }

}