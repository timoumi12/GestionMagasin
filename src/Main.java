import models.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws PrixNegatifException, MagasinPleinException {
        Magasinne magasin1 = new Magasinne(1, "Rue de la République", 100);
        Magasinne magasin2 = new Magasinne(2, "Avenue Habib Bourguiba", 150);

        Produit p1 = new Produit(1, "Lait", "Délice", 1.2);
        Produit p2 = new Produit(2, "Yaourt", "Vitalait", 0.5);
        Produit p3 = new Produit(3, "Tomate", "Sicam", 1.8);

        magasin1.ajouterProduit(p1);
        magasin1.ajouterProduit(p2);
        magasin2.ajouterProduit(p3);

        System.out.println("Caractéristiques du magasin 1:");
        magasin1.afficherCaracteristiques();

        System.out.println("\nCaractéristiques du magasin 2:");
        magasin2.afficherCaracteristiques();

        System.out.println("\nNombre total de magasins: " + Magasinne.getNombreMagasins());
        System.out.println("Nombre total de produits dans tous les magasins: " + Magasinne.getNombreTotalProduits());

        // prosit 3
        Produit pd1 = new Produit(1, "Lait", "Délice", 1.2);
        Produit pd2 = new Produit(1, "Lait", "Délice", 1.2);

        if (pd1.comparer(pd2)) {
            System.out.println("M1 Les produits sont identiques.");
        } else {
            System.out.println("M1 Les produits sont différents.");
        }

        if (Produit.comparer(p1, p2)) {
            System.out.println("M2 Les produits sont identiques.");
        } else {
            System.out.println("M2 Les produits sont différents.");
        }

        Magasinne magasin_1 = new Magasinne(1, "Rue de la République", 100);
        Produit prod1 = new Produit(1, "Lait", "Délice", 1.2);
        Produit prod2 = new Produit(2, "Yaourt", "Vitalait", 0.5);

        magasin1.ajouterProduit2(prod1);

        Produit produitRecherche = new Produit(1, "Lait", "Délice", 1.2);

        if (magasin_1.chercherProduit(produitRecherche)) {
            System.out.println("Le produit a été trouvé dans le magasin.");
        } else {
            System.out.println("Le produit n'a pas été trouvé dans le magasin.");
        }


        Magasinne m1 = new Magasinne(1, "Rue de la République", 100);
        Produit produit1 = new Produit(1, "Lait", "Délice", 1.2);
        Produit produit2 = new Produit(1, "Lait", "Délice", 1.2);

        m1.ajouterProduit2(produit1);
        m1.ajouterProduit2(produit2);

        Magasinne mag1 = new Magasinne(1, "Rue de la République", 100);
        Magasinne mag2 = new Magasinne(2, "Avenue Habib Bourguiba", 150);

        Produit prd1 = new Produit(1, "Lait", "Délice", 1.2);
        Produit prd2 = new Produit(2, "Yaourt", "Vitalait", 0.5);
        Produit prd3 = new Produit(3, "Tomate", "Sicam", 1.8);

        mag1.ajouterProduit2(prd1);
        mag1.ajouterProduit2(prd2);
        mag2.ajouterProduit2(prd3);

        Magasinne plusGrandMagasin = Magasinne.magasinAvecPlusDeProduits(mag1, mag2);

        if (plusGrandMagasin != null) {
            System.out.println("Le magasin ayant le plus de produits est : " + plusGrandMagasin);
        } else {
            System.out.println("Les deux magasins ont le même nombre de produits.");
        }

        Magasinne carrefourMagasin = new Magasinne(1, "Carrefour", "Centre-Ville", 100);
        Magasinne monoprixMagasin = new Magasinne(2, "Monoprix", "Menzah 6", 150);

        // Ajout des employés au magasin Carrefour
        carrefourMagasin.ajouterEmploye(new Caissier(1, "Ali", "Rue 1", 190, 1));
        carrefourMagasin.ajouterEmploye(new Vendeur(2, "Sara", "Rue 2", 160, 0.85));
        carrefourMagasin.ajouterEmploye(new Responsable(3, "Karim", "Rue 3", 170, 200));

        // Ajout des employés au magasin Monoprix
        monoprixMagasin.ajouterEmploye(new Caissier(4, "Mourad", "Rue 4", 175, 2));
        monoprixMagasin.ajouterEmploye(new Vendeur(5, "Yasmine", "Rue 5", 160, 0.75));
        monoprixMagasin.ajouterEmploye(new Vendeur(6, "Nadia", "Rue 6", 150, 0.80));
        monoprixMagasin.ajouterEmploye(new Responsable(7, "Fares", "Rue 7", 200, 300));

        // Affichage des caractéristiques des magasins
        carrefourMagasin.afficherCaracteristiques();
        monoprixMagasin.afficherCaracteristiques();

        // Calcul et affichage des salaires
        System.out.println("\nSalaires des employés du magasin Carrefour:");
        carrefourMagasin.afficherSalairesEmployes();

        System.out.println("\nSalaires des employés du magasin Monoprix:");
        monoprixMagasin.afficherSalairesEmployes();

        // Affichage des primes des responsables
        System.out.println("\nPrimes des responsables du magasin Carrefour:");
        carrefourMagasin.afficherPrimesResponsables();

        System.out.println("\nPrimes des responsables du magasin Monoprix:");
        monoprixMagasin.afficherPrimesResponsables();

        System.out.println("\n###################################\n");

        try {
            // Création d'un magasin
            Magasinne carrefourMagasin_ = new Magasinne(1, "Carrefour", "Centre-Ville", 100);

            // Ajout de produits
            carrefourMagasin_.ajouterProduit(new Produit(1, "Lait", "Délice", 1.2));
            carrefourMagasin_.ajouterProduit(new Produit(2, "Yaourt", "Vitalait", 0.5));

            // Tentative d'ajout d'un troisième produit
            carrefourMagasin_.ajouterProduit(new Produit(3, "Tomate", "Sicam", 1.8)); // This should throw an exception

        } catch (MagasinPleinException e) {
            System.out.println("Erreur: " + e.getMessage());
        } catch (PrixNegatifException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}
