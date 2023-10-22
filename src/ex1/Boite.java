package ex1;

public class Boite <T>{

    private T objet;
    public Boite(T objet) {
        this.objet = objet;
    }

    public T getObjet() {
        return objet;
    }

    public void setObjet(T objet) {
        this.objet = objet;
    }

    public static void main(String[] args) {
        Boite<Integer> entier = new Boite<Integer>(42);
        Boite<String> chaine = new Boite<String>("Bonjour");
        Boite<Double> reel = new Boite<Double>(3.14);

        System.out.println("Valeur entière: " + entier.getObjet());
        System.out.println("Chaîne de caractères: " + chaine.getObjet());
        System.out.println("Valeur réelle: " + reel.getObjet());
    }
}
