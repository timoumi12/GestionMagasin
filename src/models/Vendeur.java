package models;

public class Vendeur extends Employe {
    private double tauxDeVente; // taux de vente en %

    public Vendeur(int id, String nom, String adresse, int nbrHeures, double tauxDeVente) {
        super(id, nom, adresse, nbrHeures);
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public int calculerSalaire() {
        return (int) (450 * tauxDeVente); // Salaire de base de 450 DT multiplié par le taux de vente
    }

    @Override
    public String toString() {
        return super.toString() + ", Vendeur{" +
                "tauxDeVente=" + tauxDeVente +
                '}';
    }
}
