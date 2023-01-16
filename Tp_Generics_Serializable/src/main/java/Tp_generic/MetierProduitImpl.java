package Tp_generic;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements  IMetier<Produit>{
    List<Produit> produits;

    @Override
    public void add(Produit o) {
        produits.add(o);
    }

    public MetierProduitImpl(List<Produit> produits) {
        this.produits = produits;
    }


    @Override
    public List<Produit> getAll() {
        if(produits==null) {
            return null;
        }

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
                produits.add(p);
                produits.add(p2);
                produits.add(p3);
                System.out.println(produits.get(0).toString());
                System.out.println(produits.get(1).toString());
                System.out.println(produits.get(2).toString());
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }  catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return produits;

    }

    @Override
    public Produit findById(long id) {
        for(Produit p : produits)
            if(p.getId()==id)
                return p;
        return  null; //produits.stream().filter(it -> it.getId().equals(id)).findFirst();
    }

    @Override
    public void delete(long idprod) {
        Produit p =findById(idprod);
        produits.remove(p);

    }
    @Override
    public String toString() {
        return "MetierProduitImpl [produits=" + produits + "]";
    }

    @Override
    public void saveAll() {
        try {

            File file = new File("products.dat");
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Produit p = new Produit(1,"COCA","CocaCola",1200,"Frech",100);
            Produit p2 = new Produit(2,"Hawai","Hawai",1200,"Frech",100);
            Produit p3 = new Produit(2,"Hawai","Hawai",1200,"Frech",100);

            oos.writeObject(p);
            oos.writeObject(p2);
            oos.writeObject(p3);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Override
    public List<Produit> getAllFromFile() {
        // TODO Auto-generated method stub
        return null;
    }


}
