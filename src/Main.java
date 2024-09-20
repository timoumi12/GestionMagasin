import models.Produit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Produit emptyProd = new Produit();
        Produit prod1 = new Produit(1, "Lait", "Delice", 1021);
        Produit prod2 = new Produit(2, "Yaourt", "Vitalait", 2510);
        Produit prod3 = new Produit(3, "Tomate", "Sicam", 3250);
        prod1.afficher();
        prod2.afficher();
        prod3.afficher();
    }
}
