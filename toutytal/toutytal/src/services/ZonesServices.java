package services;

import java.util.List;

import entities.Zone;
import repositories.ZoneRepository;

public class ZonesServices {
    ZoneRepository zoneRepository=new ZoneRepository();
  
   public static  List<Zone>listerZones(){
    
        return ZoneRepository.SelectAll();
    }
    public void ajouterZone(Zone zone){
        zoneRepository.insert(zone);
    }
}
