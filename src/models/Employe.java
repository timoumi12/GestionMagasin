package models;

public class Employe {
    protected int id;
    protected String nom;
    protected String adresse;
    protected int nbrHeures;

    public Employe(int id, String nom, String adresse, int nbrHeures) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbrHeures = nbrHeures;
    }

    public int calculerSalaire() {
        return 0; // La classe de base ne calcule pas de salaire
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", nbrHeures=" + nbrHeures +
                '}';
    }

    // Méthode equals pour comparer deux employés
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id == employe.id && nbrHeures == employe.nbrHeures &&
                nom.equals(employe.nom) && adresse.equals(employe.adresse);
    }
}
