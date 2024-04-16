package org.example.pres;


import org.example.ext.DaoImpl2;
import org.example.metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        /*
        Injection des dépendances par instanciation statique => new
         */
        DaoImpl2 dao = new DaoImpl2();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println("Résultat : "+metier.calcul());
    }
}
