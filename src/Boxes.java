import java.util.Scanner;

public class Boxes {
    public static void main(String[] args) {
        
        /* ¡Nos mudamos de piso! Vamos a crear un pequeño programa que nos ayude a saber en qué caja pusimos las siguientes cosas:

        Caja 0. Libros
        Caja 1. Utensilios de cocina
        Caja 2. Artículos de baño
        Caja 4. Bolsos
        Caja 5. Zapatos
        Caja 6. Cosas de verano
        Caja 7. Cosas de invierno
        */

        //Crea un array con las cosas que contienen las cajas
        String[] stuffs = {"Libros", "Utensilios de cocina", "Artículos de baños", "Bolsos", "Zapatos", "Cosas de verano", "Cosas de invierno"};
        //Pregunta al usuario lo siguiente: Hola, soy tu asistente de la organización ¿Qué deseas buscar? (la respuesta deberá aparecer en la terminal en la misma línea)
        Scanner scanner = new Scanner(System.in);
        System.out.print("¡Hola!, soy tu asistente de la organización ¿Qué deseas buscar?");
        String wantedStuff = scanner.nextLine();
        //Crea un programa que te devuelva lo siguiente: <cosas> están en la caja <índice> en el caso de no existir que devuelva: <cosas> no las empacaste, ¡oops!
        int iControl = -1;
        for (int i = 0; i < stuffs.length; i++){
            if(wantedStuff.equalsIgnoreCase(stuffs[i])){
                iControl = i;

            }
        }
        if(iControl == -1){
            System.out.println(wantedStuff + " no las empacaste, ¡oops!");
        } else {
            System.out.println(wantedStuff + " están en la caja " + iControl);
        }
    }
}
