// File: tn/tuniprob/gestionmagasin/Produit.java
package models;

public class Produit {
    private int id;
    private String libelle;
    private String marque;
    private double prix;

    public Produit(int id, String libelle, String marque, double prix) throws PrixNegatifException {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        setPrix(prix);
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getMarque() {
        return marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) throws PrixNegatifException {
        if (prix < 0) {
            throw new PrixNegatifException("Le prix ne peut pas être négatif.");
        }
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                '}';
    }

    public boolean comparer(Produit autreProduit) {
        return this.id == autreProduit.id &&
                this.libelle.equals(autreProduit.getLibelle()) &&
                this.prix == autreProduit.getPrix();
    }

    public static boolean comparer(Produit p1, Produit p2) {
        return p1.getId() == p2.getId() &&
                p1.getLibelle().equals(p2.getLibelle()) &&
                p1.getPrix() == p2.getPrix();
    }
}