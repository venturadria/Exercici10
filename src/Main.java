import java.util.Scanner;

public class Main {
    void main(){

        Scanner llegir = new Scanner(System.in);

        int[] primerarray = new int[5];
        int[] segonarray = new int[5];
        int[] arrayresultat = new int[5];

        for (int i = 0; i < primerarray.length; i++){
            System.out.println("Escriu el valor " + (i+1) + " del primer array.");
            primerarray[i] = llegir.nextInt();
        }

        for (int i = 0; i < segonarray.length; i++){
            System.out.println("Escriu el valor " + (i+1) + " del segon array.");
            segonarray[i] = llegir.nextInt();
        }

        for (int i = 0; i < arrayresultat.length; i++){
            arrayresultat[i] = primerarray[i] + segonarray[i];
        }

        System.out.print("Valors del primer array: ");
        for (int i = 0; i < primerarray.length; i++){
            System.out.print(primerarray[i] + " ");
        }
        System.out.println();
        System.out.print("Valors del segon array: ");
        for (int i = 0; i < segonarray.length; i++){
            System.out.print(segonarray[i] + " ");
        }
        System.out.println();
        System.out.print("Resultats: ");
        for (int i = 0; i < arrayresultat.length; i++){
            System.out.print((arrayresultat[i]) + " ");
        }

    }
}
