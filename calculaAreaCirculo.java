/*
 * Pedir el radio de un círculo y 
 * calcular su área. A=PI*r^2.
 * 
 * Authora: Esther Hitos Garcia
 */

public class calculaAreaCirculo {
    public static void main(String[] args) {
        double a, r; // área y radio
        System.out.print("Introduce el radio de un circulo: ");
        r =  Integer.parseInt(System.console().readLine());
        a = Math.PI * (r * r); // para elevar al cuadrado otra opción es: Math.pow (r, 2)

        System.out.printf("El área de una circunferencia de radio %.2f es: %.2f\n",r,a);
    }
}
