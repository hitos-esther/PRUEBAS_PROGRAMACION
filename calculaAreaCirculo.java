/*
 * Pedir el radio de un c�rculo y 
 * calcular su �rea. A=PI*r^2.
 * 
 * Authora: Esther Hitos Garcia
 */

public class calculaAreaCirculo {
    public static void main(String[] args) {
        double a, r; // �rea y radio
        System.out.print("Introduce el radio de un circulo: ");
        r =  Integer.parseInt(System.console().readLine());
        a = Math.PI * (r * r); // para elevar al cuadrado otra opci�n es: Math.pow (r, 2)

        System.out.printf("El �rea de una circunferencia de radio %.2f es: %.2f\n",r,a);
    }
}
