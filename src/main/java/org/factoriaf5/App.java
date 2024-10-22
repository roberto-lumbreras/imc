package org.factoriaf5;

import java.util.Locale;
import java.util.Scanner;

public class App
{
    static String input;
    static Double peso;
    static Double altura;
    public static void main( String[] args )
    {
        try(Scanner sc = new Scanner(System.in).useLocale(Locale.US)){
            System.out.println("Introducir peso en kg");
            input = sc.next();
            while(!esDoublePositivo(input)){
                System.out.println("Input no valido. Introduzca el peso de nuevo");
                input = sc.next();
            }
            peso = Double.valueOf(input);
            System.out.println("Introducir altura en metros");
            input = sc.next();
            while(!esDoublePositivo(input)){
                System.out.println("Input no valido. Introduzca la altura de nuevo");
                input = sc.next();
            }
            altura = Double.valueOf(input);
            System.out.println("Tu indice de IMC es "+calcularIMC(peso,altura));
            System.out.println("Evaluacion del resultado: "+evaluarResultadoIMC(calcularIMC(peso,altura)));
        }
    }
    public static Double calcularIMC(Double peso,Double altura){
        return Math.floor((peso/Math.pow(altura, 2))*100)/100;
    }
    public static String evaluarResultadoIMC(Double imc){
        return imc<16?"delgadez severa"
        :imc<17?"delgadez moderada"
        :imc<18.5?"delgadez leve"
        :imc<25?"peso normal"
        :imc<30?"sobrepeso"
        :imc<35?"obesidad leve"
        :imc<40?"obesidad moderada"
        :"obesidad morbida";
    }

    public static boolean esDoublePositivo(String input){
        try{
            return Double.parseDouble(input)>0;
        }catch(NumberFormatException e){
            return false;
        }
    }
}
