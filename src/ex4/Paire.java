package ex4;

public class Paire<T, U> {
    private T premier;
    private U deuxieme;

    public Paire(T premier, U deuxieme) {
        this.premier = premier;
        this.deuxieme = deuxieme;
    }

    public T getPremier() {
        return premier;
    }

    public U getDeuxieme() {
        return deuxieme;
    }

    public static void main(String[] args) {
        Paire<Integer, String> paire1 = new Paire<>(42, "Bonjour");
        Paire<Double, String> paire2 = new Paire<>(3.14, "Au revoir");

        System.out.println("Paire 1: " + paire1.getPremier() + ", " + paire1.getDeuxieme());
        System.out.println("Paire 2: " + paire2.getPremier() + ", " + paire2.getDeuxieme());
    }
}
