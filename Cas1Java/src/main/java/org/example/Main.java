package org.example;

public class Main {
    public static void main(String[] args) {

        // Créons une voiture configurée
        StandardPackCar standardCar = new StandardPackCar("ClioRadioV3", "v2012.10.23.A");

        // Créons une voiture de sport configurée
        SportsPackCar sportsCar = new SportsPackCar("ClioRadioV3", "v2012.10.23.A", "SportsSuspensionV6", "SportsWheelsV8");

        // Affichons leurs détails (affichage dans la fenêtre de visualisation)
        System.out.println(standardCar);
        System.out.println(sportsCar);

        // Un nouveau client souhaite exactement la même configuration que la voiture de sport précédente
        // Que faire ??? Créer une nouvelle voiture de sport ? Non, c'est trop long et trop cher !
        // Il faut cloner la voiture de sport précédente
        SportsPackCar sportsCarClone = sportsCar.clone();

        // Affichons les détails de la voiture de sport clonée (affichage dans la fenêtre de visualisation)
        System.out.println(sportsCarClone);

        // Vérifions que les deux voitures de sport sont bien des objets différents
        System.out.println(sportsCar == sportsCarClone);
    }
}