package org.example.pres;

import org.example.dao.IDao;
import org.example.metier.IMetier;

import java.io.File;
import java.lang.Exception;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("D:\\EMSI\\OULAIZ_IIR_4èmeAnnée\\S2\\JEE\\TP\\TP_1\\fido\\src\\main\\java\\org\\example\\config.txt"));

        String daoClassName=scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();

        String metierClassName=scanner.nextLine();
        Class cmetier=Class.forName(metierClassName);
        IMetier metier = (IMetier) cmetier.newInstance();

        Method method=cmetier.getMethod("setDao",IDao.class);
        // metier.setDao(dao);
        method.invoke(metier,dao);

        System.out.println("Résultat=>"+metier.calcul());
    }
}
