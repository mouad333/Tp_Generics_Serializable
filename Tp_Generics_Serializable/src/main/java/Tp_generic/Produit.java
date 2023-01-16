package Tp_generic;

import java.io.Serializable;

public class Produit implements Serializable {
    private long id;
    private String nom;
    private String marque;
    private double prix;
    private String description;
    private int nbrEnStock;
    public Produit() {

    }
    public Produit(long id, String nom, String marque, double prix, String description, int nbrEnStock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nbrEnStock = nbrEnStock;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getNbrEnStock() {
        return nbrEnStock;
    }
    public void setNbrEnStock(int nbrEnStock) {
        this.nbrEnStock = nbrEnStock;
    }
    @Override
    public String toString() {
        return String.format("Id=%d, nom=%s, marque=%s, prix=%f, stock=%d, description=%s%n", id, nom,
                marque, prix, nbrEnStock, description);
    }

}
