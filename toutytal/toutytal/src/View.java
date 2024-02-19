import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import entities.Zone;
import services.ZonesServices;

public class View {
    public static void main(String[] args) throws Exception {
        int choix;
        Scanner sc=new Scanner(System.in);
         
        do {
            System.out.println("1-Creer une zone ");
            System.out.println("2-Lister Toutes les zones"); 
            System.out.println("3-Ajouter un bien et l'associer à une zone"); 
            System.out.println("4-Lister les biens en affichant le nom de la zone ");
            System.out.println("5-Quitter"); 

             choix=sc.nextInt();
             sc.nextLine();
            switch (choix) {
                case 1:
                System.out.print("Entrez l'ID de la zone : ");
                int id = sc.nextInt();
                sc.nextLine(); 
                System.out.print("Entrez le nom de la zone : ");
                String nomZone = sc.nextLine();
                System.out.println("La zone est créée.");
          
                    break;
                    case 2:
                    List<Zone> zones=  ZonesServices.listerZones();
                     for (Zone zone: zones) {
                          System.out.println("Id "+ zone.getId());
                          System.out.println("nomZone "+ zone.getNomZone());
                          System.out.println("=================================");
                     }
                    break;
                    case 3:
                    System.out.println("Entrer un id");
                    id=sc.nextInt(); 
                    System.out.println("Entrer une reference");
                    String reference=sc.nextLine();
                    System.out.println("Entrer une description");
                    String description=sc.nextLine() 
                    System.out.println("Entrer un prix ");
                    Double prix=sc.nextDouble();
                    break;
                    case 4:
                    int type=sc.nextInt();
                    sc.nextLine();
                     System.out.println("Entrer le nom de la zone");
                     nomZone=sc.nextLine();
                      zones = ZonesServices.rechercherZoneParnomZone(zones);
                        if (zones==null) {
                             System.out.println("Entrer un id");
                              id=sc.nextInt(); 
                             System.out.println("Entrer un nom");
                             nomZone=sc.nextLine();   
                             zones=new Zones();
                             zones.setId(id);
                             zones.setPrenom(nom);
                             zones.setNomZone(nomZone);
                             zonesService.ajouterZone(zones);
                        }
                     }
                    break;
            

} while (choix!=10);
}
              
}



