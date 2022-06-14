import java.util.Scanner;
public class EjemploExcepciones04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa pinta varias l�neas de asteriscos");
        System.out.print("Introduzca el numero total de asteriscos: ");
        int asteriscos = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca el numero de l�neas que quiere pintar: ");
        int lineas = Integer.parseInt(s.nextLine());
        int longitud = (asteriscos % lineas) == 0 ? asteriscos / lineas : (int)Math.ceil((double)asteriscos / lineas);
        int cuentaAsteriscos = 0;
    for (int i = 1; i <= lineas; i++) {
        System.out.print("L�nea " + i + ": ");
        for (int j = 0; (j < longitud) && (cuentaAsteriscos++ < asteriscos); j++) {
        System.out.print("*");
        }
System.out.println();
}
    }
}