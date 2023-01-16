package Tp_generic;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestDeserialize {
    public static void main(String[] args) {

    File f1 = new File("product.dat");
    FileInputStream fss;
    ObjectInputStream objectInputStream;
    List<Produit> produitList;

        {
        try {
            fss = new FileInputStream(f1);
            objectInputStream = new ObjectInputStream(fss);
            Produit p =(Produit) objectInputStream.readObject();
            Produit p2 =(Produit) objectInputStream.readObject();
            Produit p3 =(Produit) objectInputStream.readObject();
            produitList = new ArrayList<>();
            produitList.add(p);
            produitList.add(p2);
            produitList.add(p3);
            System.out.println(produitList.get(0).toString());
            System.out.println(produitList.get(1).toString());
            System.out.println(produitList.get(2).toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }  catch (IOException e) {
        throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }




    }

}
