// 2- CALCULAR
// Con switch, preguntar la operación, y con switch envíalo a una función diferente
// ( ‘sumar’, ‘restar’, ‘multiplicar’ y ‘dividir’ )que retorne el resultado a la opción del switch y se
// muestre en terminal.


// +EXTRA: Opcional: colocar todo el programa en un bucle que siga funcionando mientras que el usuario no
// escriba “s” (salir).

// +EXTRA: usar char y (+, -, *,/)

import java.util.Scanner;

public class Java8ejericio2 {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner (System.in);

        String operacion = "";

        while (!operacion.equalsIgnoreCase("salir")){

            System.out.println("Que operación matemática quieres hacer? Sumar, restar, multiplicar o dividir? Si no quieres continuar, escribe salir");

            operacion = sc.nextLine();

            switch (operacion){
                case "sumar":
                    sumar();
                    break;
                case "restar":
                    restar();
                    break;
                case "multiplicar":
                    multiplicar();
                    break;
                case "dividir":
                    dividir();
                    break;
                default:
                    System.out.println("Debes poner: sumar, restar, multiplicar o dividir");
    
            }

        }

        sc.close();

    }

    public static void sumar(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa el primer numero:");
        double num1 = sc.nextDouble();
        System.out.println("Ingresa el segundo numero:");
        double num2 = sc.nextDouble();
        double resultadoSuma = num1 + num2;
        System.out.println("El restulado es: " + resultadoSuma);
    }

    public static void restar(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa el primer numero:");
        double num1 = sc.nextDouble();
        System.out.println("Ingresa el segundo numero:");
        double num2 = sc.nextDouble();
        double resultadoResta = num1 - num2;
        System.out.println("El restulado es: " + resultadoResta);
    }

    public static void dividir(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa el primer numero:");
        double num1 = sc.nextDouble();
        System.out.println("Ingresa el segundo numero:");
        double num2 = sc.nextDouble();
        double resultadoDivision = num1 / num2;
        System.out.println("El restulado es: " + resultadoDivision);
    }

    public static void multiplicar(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa el primer numero:");
        double num1 = sc.nextDouble();
        System.out.println("Ingresa el segundo numero:");
        double num2 = sc.nextDouble();
        double resultadoMultiplicacion = num1 * num2;
        System.out.println("El restulado es: " + resultadoMultiplicacion);
    }

}
