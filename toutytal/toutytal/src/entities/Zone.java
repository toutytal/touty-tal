package entities;


import java.util.ArrayList;

public class Zone {
    private int id;
    private String nomZone;

    ArrayList<Biens> biensList=new ArrayList<>();
    
    public Zone() {
    }
    public ArrayList<Biens> getBiensList() {
        return biensList;
    }
    public void setBiensList(ArrayList<Biens> biensList) {
        this.biensList = biensList;
    }

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomZone() {
        return nomZone;
    }
    public void setNomZone(String nomZone) {
        this.nomZone = nomZone;
    }
    
}
    
    