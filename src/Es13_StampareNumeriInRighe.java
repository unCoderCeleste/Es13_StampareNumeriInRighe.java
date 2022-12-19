/*
Esercizio 13:
Si scriva un algoritmo per stampare i primi venti numeri da 1 a 20 su righe da 5 numeri
Ripetere l’algoritmo impiegando la Scanner per specificare quanti numeri stampare e
quanti ne deve contenere ogni riga.
Implementare l’algoritmo facendo in modo che l’utente decida se stampare i numeri pari
o dispari (scelti in un range di valori e su quante colonne)
 */
import java.util.Scanner;
public class Es13_StampareNumeriInRighe {
    public static void main(String[] args) {
        Scanner stamp= new Scanner(System.in);
        System.out.println("STAMPARE NUMERI.");
        System.out.println("1º sezione del programma: conta e stampa i numeri da 1 a 20 su righe da 5 numeri.\n");
        int array1[]= new int[20];
        int contCol=0;
            for (int i = 0; i<20; i++) {
                array1[i] = (i+1);
                System.out.print(array1[i] + "\t");
                contCol++;
                if(contCol==5){
                    System.out.println();
                    contCol=0;
                }
        }
        System.out.println("\n2º sezione: conta e stampa i numeri fino a un massimo, in una quantità di colonne. Entrambi definiti dall'utente.");
        System.out.print("Quanti numeri vuole contare e stampare?: ");
        int numeri= stamp.nextInt();
        System.out.print("In quante colonne?: ");
        int colonne= stamp.nextInt();
        System.out.println();
        int array2[]= new int[numeri];
        int contCol2=0;
        for (int i=0; i<numeri; i++) {
            array2[i] = (i+1);
            System.out.print(array2[i] + "\t");
            contCol2++;
            if(contCol2==colonne){
                System.out.println();
                contCol2=0;
            }
        }
        System.out.println("\n");
        System.out.println("3º sezione: come l'anteriore ma si può scegliere il range (min e max) e di stampare numeri Pari o Dispari");
        System.out.print("Definisca il MINIMO del range: ");
        int min= stamp.nextInt();
        System.out.print("Definisca il MASSIMO del range: ");
        int max= stamp.nextInt();
        int range= max-min;
        System.out.print("In quante colonne?: ");
        int colonne2= stamp.nextInt();
        System.out.print("Vuole stampare i numeri PARI o DISPARI? (P/D): ");
        String pardis= stamp.next();
        System.out.println();
        int array3[]= new int[range+1]; //[range+1] perché altrimenti non crea spazio nell'array per l'ultimo numero del range, cioè il massimo
        int contCol3=0;
        for (int i=0; i<=range; i++) {
            array3[i] = min;
            switch(pardis){
                case "p":
                case "P":
                    if(array3[i]%2 == 0) {
                        System.out.print(array3[i] +"\t");
                        contCol3++;
                    }
                    break;
                case "d":
                case "D":
                    if(array3[i]%2 != 0){
                        System.out.print(array3[i] +"\t");
                        contCol3++;
                    }
                    break;
            }
            min++;
            if(contCol3==colonne2){
                System.out.println();
                contCol3=0;
            }
        }
    }
}