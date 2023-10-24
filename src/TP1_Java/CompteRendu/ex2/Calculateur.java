package TP1_Java.CompteRendu.ex2;

public class Calculateur {
    public static <T > double somme(T[] tableau) {
        double somme=0.0;
        for(T elem :tableau)
        {
            if(elem instanceof Integer)
                somme+=(Integer)elem;
            else if (elem instanceof Double)
                somme+=(double)elem;
            else if (elem instanceof String)
            {
                somme+=Double.parseDouble((String)elem);
            }
        }
       /* for( int i=0; i<tableau.length; i++){
            somme+=tableau[i].doubleValue();
        }*/

        return  somme;
    }

    public static void main(String[] args) {
        Integer[] entiers = {1, 2, 3, 4, 5};
        Double[]  doubles = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[]  chaines = {"1.1", "2.2", "3.3", "4.4", "5.5"};

        double resultatEntiers = somme(entiers);
        System.out.println("Somme des entiers : " + resultatEntiers);

        double resultatDoubles = somme(doubles);
        System.out.println("Somme des doubles : " + resultatDoubles);

        double resultatChaines = somme(chaines);
        System.out.println("Somme des chaînes converties en double : " + resultatChaines);
    }
}
