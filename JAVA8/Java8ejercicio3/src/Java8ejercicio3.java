
// 3- CACATÚA CACAHUETES!


// Tienes una cacatúa que todo el rato te pide comer cacahuetes, diciendo “cacatúa cacahuetes!”.


// El programa te pregunta qué comida le das.


// Mientras NO sean cacahuetes, sigue diciendo “cacatúa cacahuetes!”


// Pero si le das cacahuetes, llama al método ‘dormirse’ y se calla, y en vez del mensaje anterior,
// vemos ‘zzZzzzz…’ (aquí acaba el programa)

// *EXTRA: realizar no solo el método 'dormirse()', sino también el de 'pideComida()

import java.util.Scanner;

public class Java8ejercicio3 {
    public static void main(String[] args) throws Exception {

        System.out.println("Tenemos una cacatua que no para de pedirnos cacahuetes. Esta dodo el rato diciendo 'cacatúa cacahuetes!'");
       
        Scanner sc = new Scanner (System.in);
        String comida = "";

        while (!comida.equalsIgnoreCase("cacahuetes")){
            System.out.println("Que comida le estas dando?");
            comida = sc.nextLine();

            if (!comida.equalsIgnoreCase("cacahuetes")){
                pedir();
            } else {
                dormir();
            }
        }
        
        sc.close();

    }

    public static void dormir(){
        System.out.print("zzzzzzzzzzzzzz...");
    }

    public static void pedir(){
        System.out.println("cacatua cacahuetes!");
    }


}
