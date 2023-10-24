package TP1_Java.CompteRendu;

public class Produit<T>{
    private String nom;
    private T prix;
    private T ref;

    public Produit(String nom, T prix, T ref) {
        this.nom = nom;
        this.prix = prix;
        this.ref = ref;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public T getPrix() {
        return prix;
    }

    public void setPrix(T prix) {
        this.prix = prix;
    }

    public T getRef() {
        return ref;
    }

    public void setRef(T ref) {
        this.ref = ref;
    }
}
