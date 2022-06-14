/**
 * Realiza un programa que pida una hora por teclado y 
 * que muestre luego buenos días, buenas tardes o buenas noches según la hora. 
 * Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente.
 * Sólo se tienen en cuenta las horas, los minutos no se deben 
 * introducir por teclado.
 * 
 * Authora: Esther Hitos Garcia
 */

public class mananaTardeNoche{

    public static void main(String[] args) {
        float pideHora;

        System.out.println("Dime la hora, plis: ");
        pideHora = Float.parseFloat(System.console().readLine());

        if (pideHora >=6 && pideHora<= 12){
            System.out.println("Buenos dias");
        }else if (pideHora>=13 && pideHora<=20){
            System.out.println("Buenos Tardes");
        }else if(pideHora>21 || pideHora <5){
            System.out.println("Buenas Noches");
        }

    }
        
    
}