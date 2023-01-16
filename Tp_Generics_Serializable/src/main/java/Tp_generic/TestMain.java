package Tp_generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        List<Produit> listProduct = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        //Test d'implémentation Des fonctionnalités :
        IMetier<Produit> metier   = new MetierProduitImpl(listProduct);

        int x = 0;
        do {
            System.out.println("-----Product------");
            System.out.println("1. Add product to product list");
            System.out.println("2. find product by id");
            System.out.println("3. Display all product details");
            System.out.println("4. delete product");
            System.out.println("5. Serialize Product");
            System.out.println("6. Exit");
            System.out.println("Choice:");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter id product :");
                    long idprod = scan.nextLong();
                    System.out.println("enter name product : ");
                    String nom = scan.next();
                    System.out.println("enter marque product : ");
                    String marque = scan.next();
                    System.out.println("enter price product : ");
                    int prix = scan.nextInt();
                    System.out.println("enter description product : ");
                    String desc = scan.next();
                    System.out.println("enter nbrenstock product : ");
                    int nbrenstock = scan.nextInt();
                    Produit p= new Produit(idprod,nom,marque,prix,desc,nbrenstock);
                    metier.add(p);
                    break;
                case 2:
                    System.out.println("enter id Product : ");
                    long idp = scan.nextLong();
                    Produit prod =metier.findById(idp);
                    System.out.println(prod);
                    break;

                case 3:
                    System.out.println(metier.getAll());
                    break;

                case 4:
                    System.out.println("enter id Product : ");
                    long idpr = scan.nextLong();
                    metier.delete(idpr);
                    System.out.println(metier.getAll());
                    break;
                case 5:
                    metier.saveAll();
                    break;
                case 6:
                    System.out.println("Thank you!\n");
                    break;
                default:
                    System.out.println("go back to swich");
            }
        }  while(x!=7);

    }
}
