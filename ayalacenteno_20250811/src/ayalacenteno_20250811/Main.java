/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ayalacenteno_20250811;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    //variables globales
    
    public static int horasEnUnDia = 24;
    public static int segundosEnUnaHora = 3600;
    public static int segundosEnUnMinuto = 60;
    
    public static void main(String[] args) {
        // TODO code application logic here
        //varible local
        int segundosTotales = 91111;
        //se asigna el valor de dias a la variable local
        int dias = calcularDias(segundosTotales);
        //se asigna el valor de los segundos exedentes del calculo de dias
        //calculando dias
        int segundosRestantesDespuesDeExtraerDias = obtenerSegundosRestantesDepuesExtraerDias(segundosTotales);
        //se asigna el valor de las horas a partir de los segundos exedentes del calculo de dias
        int horas = calcularHoras(segundosRestantesDespuesDeExtraerDias);
        int segundosRestantesDespuesDeExtraerHoras = obtenerSegundosRestantesDespuesDeExtraerHoras(segundosRestantesDespuesDeExtraerDias);
        //se asigna el valor de las horas a partir de los segundos exedentes del calculo de horas        
        int minutos = calcularMinutos(segundosRestantesDespuesDeExtraerHoras);
        //los segundos que quedan despues de haber realizado todos los calculos anteriores
        int segundosFinales = obtenerSegundosRestantesDespuesDeExraerMinutos(segundosRestantesDespuesDeExtraerHoras); 
        
        //salida al usuario
        System.out.println("Usted ha solicitado calcular los dias, horas, minutos y segundos a partir de un numero mayor a 86400");
        System.out.println("Usted ha indicado el valor actual de segundos como: "+segundosTotales);
        System.out.println("Dias: "+dias);
        System.out.println("Horas: "+horas);
        System.out.println("Minutos: "+minutos);
        System.out.println("Segundos: "+segundosFinales);
        
    }
    
    //Modulo para calcular la cantidad de dias
    public static int calcularDias (int segundosTotales){
        return segundosTotales/(Main.horasEnUnDia*Main.segundosEnUnaHora);
    }
    //Modulo para calcular los segundos restantes despues de extraer los dias
    public static int obtenerSegundosRestantesDepuesExtraerDias(int segundosTotales){
        return segundosTotales % (Main.horasEnUnDia*Main.segundosEnUnaHora);
    }
    //Modulo parra calcular las horas
    public static int calcularHoras(int segundosRestantes){
        return segundosRestantes/Main.segundosEnUnaHora;
    }
    //Modulo para calcular los segundos restantes despues de extraer las horas
    public static int obtenerSegundosRestantesDespuesDeExtraerHoras(int segundosRestantes){
        return segundosRestantes % Main.segundosEnUnaHora;
    }
    //modulo para calcular la cantidad de minutos a partir de los segundos restantes
    public static int calcularMinutos(int segundosRestantes){
        return segundosRestantes/Main.segundosEnUnMinuto;
    }
    //modulo para calcula los segundos restantes despues de extraer los minutos
    public static int obtenerSegundosRestantesDespuesDeExraerMinutos(int segundosRestantes){
        return segundosRestantes % Main.segundosEnUnMinuto;
    }
    
}
