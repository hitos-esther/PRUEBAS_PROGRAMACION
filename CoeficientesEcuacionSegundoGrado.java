/*
 * Pedir los coeficientes de una ecuación se 2º grado, 
 * y muestre sus soluciones reales. 
 * Si no existen,debe indicarlo.
 * 
 * Authora: Esther Hitos Garcia
 */

public class CoeficientesEcuacionSegundoGrado {
    public static void main(String[] args) {
        double a, b, c; // coeficientes ax^2+bx+c=0
        double x1, x2, d; // soluciones y determinante

        System.out.println("Introduzca primer coeficiente (a):");
        a =  Double.parseDouble(System.console().readLine());
        System.out.println("Introduzca segundo coeficiente: (b):");
        b =  Double.parseDouble(System.console().readLine());
        System.out.println("Introduzca tercer coeficiente: (c):");
        c =  Double.parseDouble(System.console().readLine());

        // calculamos el determinante
        d = ((b * b) - 4 * a * c);
        if (d < 0)
            System.out.println("No existen soluciones reales");
        else {
            // queda confirmar que a sea distinto de 0.
            // si a=0 nos encontramos una division por cero.

            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.printf("Solucion: %3f ", x1);
            System.out.printf("Solucion: %3f", x2);
        }

    }
}
