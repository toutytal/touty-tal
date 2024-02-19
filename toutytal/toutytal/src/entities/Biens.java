package entities;

import java.sql.Date;

public class Biens {
    private int id;
    private String reference;
    private String description;
    private double prix ;
    private Date datecreation;
    private Zone zone;

    public Zone getZone() {
        return zone;
    }
    public void setZone(Zone zone) {
        this.zone = zone;
    }
    public Biens() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public Date getDatecreation() {
        return datecreation;
    }
    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }
}
