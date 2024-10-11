package models;

public class Responsable extends Employe {
    private int prime;

    public Responsable(int id, String nom, String adresse, int nbrHeures, int prime) {
        super(id, nom, adresse, nbrHeures);
        this.prime = prime;
    }

    @Override
    public int calculerSalaire() {
        int salaire = nbrHeures * 10; // 10 DT/H
        if (nbrHeures > 160) {
            salaire += (nbrHeures - 160) * 10 * 0.20; // 20% de plus pour les heures supplémentaires
        }
        return salaire + prime;
    }

    public int getPrime() {
        return prime;
    }

    @Override
    public String toString() {
        return super.toString() + ", Responsable{" +
                "prime=" + prime +
                '}';
    }
}
