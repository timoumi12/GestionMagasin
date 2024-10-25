package models;

public class Magasinne {
    private int id;
    private String adresse;
    private int capacite;
    private Produit[] produits;
    private int nombreProduits;

    private static int nombreTotalProduits = 0;
    private static int nombreMagasins = 0;

    private String nom;
    private Employe[] employes;
    private int nombreEmployes;

    public Magasinne(int id, String adresse, int capacite) {
        this.id = id;
        this.adresse = adresse;
        this.capacite = capacite;
        this.produits = new Produit[2]; // Size set to 2
        this.nombreProduits = 0;
        nombreMagasins++;
    }

    public void ajouterProduit(Produit produit) throws MagasinPleinException {
        if (nombreProduits >= produits.length) {
            throw new MagasinPleinException("Le magasin est plein, impossible d'ajouter le produit.");
        }
        produits[nombreProduits] = produit;
        nombreProduits++;
        nombreTotalProduits++;
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

    public Magasinne(int id, String nom, String adresse, int capacite) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.capacite = capacite;
        this.produits = new Produit[50];
        this.nombreProduits = 0;
        this.employes = new Employe[20];
        this.nombreEmployes = 0;
        nombreMagasins++;
    }

    // Méthode pour ajouter un employé
    public boolean ajouterEmploye(Employe employe) {
        if (nombreEmployes < employes.length) {
            employes[nombreEmployes] = employe;
            nombreEmployes++;
            return true;
        }
        return false;
    }

    public void afficherCaracteristiques() {
        System.out.println("Magasinne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", capacite=" + capacite +
                '}');

        System.out.println("Produits:");
        for (int i = 0; i < nombreProduits; i++) {
            System.out.println("- " + produits[i].getLibelle() + " : " + produits[i].getPrix());
        }

        System.out.println("Employés:");
        for (int i = 0; i < nombreEmployes; i++) {
            System.out.println(employes[i]);
        }
    }

    // Méthode pour afficher les salaires des employés
    public void afficherSalairesEmployes() {
        for (int i = 0; i < nombreEmployes; i++) {
            System.out.println("Salaire de " + employes[i].nom + " : " + employes[i].calculerSalaire() + " DT");
        }
    }

    // Méthode pour afficher les primes des responsables
    public void afficherPrimesResponsables() {
        for (int i = 0; i < nombreEmployes; i++) {
            if (employes[i] instanceof Responsable) {
                System.out.println("Prime de " + employes[i].nom + " : " + ((Responsable) employes[i]).getPrime() + " DT");
            }
        }
    }

}