// 1- SALUDAR!
// Pides saludo y nombre (ejemplo: ‘Hola’ y ‘Andrés’)
// Y te responde ‘Hola Andrés’.
// Realizar la función de saludar, de tres maneras diferentes:
// 1.1- Llamas a la función, sin parámetros, y sin return, y te hace el programa (resultado ejemplo: ‘Hola
// Andrés’).
// 1.2 -- Llamas a la función, con parámetros (saludo y nombre), y sin return, y muestra el resultado
// DENTRO de la función (resultado ejemplo: ‘Hola Andrés’).
// 1.3- Llamas a la función, con parámetros (saludo y nombre), y con return, y muestra el resultado.
// FUERA de ese método, y dentro del main() (resultado ejemplo: ‘Hola Andrés’).

import java.util.Scanner;

public class Java8ejercicio1 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dime un nombre");
        String nombreUsuario = sc.nextLine();
        System.out.println("Dime un saludo");
        String saludoUsuario = sc.nextLine();

        saludo();

        saludar(nombreUsuario, saludoUsuario);

        String resultadoSaludo = saluda (nombreUsuario, saludoUsuario);
        System.out.println(resultadoSaludo);

        sc.close();
    }

    // // con parametros, sin return:

    public static void saludar(String nombre, String saludo){
        System.out.println(nombre + " " + saludo + "!");
    }

    // // sin parametros, sin return:

    public static void saludo() {
        System.out.println("Hola Andrés");
    }

    // // con parametros, con return:

    public static String saluda(String nombre, String saludo){
        return saludo + " " + nombre;
    }


}
