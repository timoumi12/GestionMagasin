package models;

public class Caissier extends Employe {
    private int numeroDeCaisse;

    public Caissier(int id, String nom, String adresse, int nbrHeures, int numeroDeCaisse) {
        super(id, nom, adresse, nbrHeures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public int calculerSalaire() {
        int salaire = nbrHeures * 5; // 5 DT/H
        if (nbrHeures > 180) {
            salaire += (nbrHeures - 180) * 5 * 0.15; // 15% de plus pour les heures supplémentaires
        }
        return salaire;
    }

    @Override
    public String toString() {
        return super.toString() + ", Caissier{" +
                "numeroDeCaisse=" + numeroDeCaisse +
                '}';
    }
}
