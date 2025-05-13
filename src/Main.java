import Figury2D.*;
import Figury3D.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {






        FiguraPlaska[] figuryPlaskie = new FiguraPlaska[7];
        figuryPlaskie[0] = new Kolo();
        figuryPlaskie[1] = new Kwadrat();
        figuryPlaskie[2] = new Prostokat();
        figuryPlaskie[3] = new Romb();
        figuryPlaskie[4] = new Rownoleglobok();
        figuryPlaskie[5] = new Trapez();
        figuryPlaskie[6] = new Trojkat();

        FiguraPrzestrzenna[] figuryPrzestrzenna = new FiguraPrzestrzenna[5];
        figuryPrzestrzenna[0] = new Kula();
        figuryPrzestrzenna[1] = new Prostopadloscian();
        figuryPrzestrzenna[2] = new Stozek();
        figuryPrzestrzenna[3] = new Szescian();
        figuryPrzestrzenna[4] = new Walec();



        Scanner sc = new Scanner(System.in);
        boolean stan = true;


        while(stan){
            System.out.println("Wybierz opcje: ");
            System.out.println("1) Figura 2D ");
            System.out.println("2) Figura 3D ");
            String opcja = sc.nextLine();
            if(opcja.equals("1")){
                System.out.println("1) Kolo");
                System.out.println("2) Kwadrat");
                System.out.println("3) Prostokat");
                System.out.println("4) Romb");
                System.out.println("5) Rownoleglobok");
                System.out.println("6) Trapez");
                System.out.println("7) Trojkat");
                opcja = sc.nextLine();
                switch(opcja){
                    case "1":
                       





                }

            }
            else if(opcja.equals("2")){
                System.out.println("1) Kula");
                System.out.println("2) Prostopadloscian");
                System.out.println("3) Stozek");
                System.out.println("4) Szescian");
                System.out.println("5) Walec");
                opcja = sc.nextLine();
                switch(opcja){





                }

            }
            else{
                System.out.println("Error...");
                stan = false;
            }



        }


    }
}