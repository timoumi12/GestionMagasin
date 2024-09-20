package models;

public class Produit {
    int id;
    String libelle;
    String marque;
    float prix;

    public Produit (){
        this.id=0;
        this.libelle="";
        this.marque="";
        this.prix=0;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produit (int id, String labelle , String marque , float prix){
        this.id=id;
        this.libelle=labelle;
        this.marque=marque;
        this.prix=prix;
    }

    public void afficher (){
        System.out.println("Détails de produit: \n labelle: "+this.libelle +"\n Prix: "+this.prix +"\n Marque: "+ this.marque);
    }




}