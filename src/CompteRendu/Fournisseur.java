package CompteRendu;

import java.util.ArrayList;
import java.util.List;

public class Fournisseur<T> {
    private String nomFou;
    private int idFou;
    private List<Produit<T>> produitsFournis;

    public Fournisseur(String nomFournisseur, int idFournisseur) {
        this.nomFou = nomFournisseur;
        this.idFou = idFournisseur;
        this.produitsFournis = new ArrayList<>();
    }

    public void ajouterProduit(Produit<T> produit) {
        produitsFournis.add(produit);
    }

    public void afficherProduits() {
        for (Produit<T> produit : produitsFournis) {
            System.out.println("Produit: " + produit.getNom() + ", Référence: " + produit.getRef() + ", Prix: " + produit.getPrix());
        }
    }
}