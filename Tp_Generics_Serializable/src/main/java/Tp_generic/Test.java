package Tp_generic;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
            File file = new File("product.dat");
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Produit p = new Produit(1,"COCA","CocaCola",1200,"Frech",100);
            Produit p2 = new Produit(2,"Hawai","Hawai",1200,"Frech",100);
            Produit p3 = new Produit(2,"Hawai","Hawai",1200,"Frech",100);
            Produit p4 = new Produit(2,"Hawai","Hawai",1200,"Frech",100);

            oos.writeObject(p);
            oos.writeObject(p2);
            oos.writeObject(p3);
            oos.writeObject(p4);

    }
}
