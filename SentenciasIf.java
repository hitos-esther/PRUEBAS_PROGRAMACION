/*Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.
 */
public class SentenciasIf {

    public static void main(String[] args) {
        System.out.println(" Días de la semana");
        System.out.println(" ----------------");
        System.out.println(" 1. Lunes");
        System.out.println(" 2. Martes");
        System.out.println(" 3. Miercoles");
        System.out.println(" 4. Jueves");
        System.out.println(" 5. Viernes");
        System.out.print("Por favor, introduzca un numero de semana: ");
        int semana = Integer.parseInt(System.console().readLine());

        switch (semana) {

            case 1:
                System.out.println("Hoy es lunes");

                break;
            case 2:
                System.out.println("Hoy es martes");
                break;
            case 3:
                System.out.println("Hoy es miercoles");

                break;
            case 4:
                System.out.println("Hoy es jueves");

                break;
            case 5:
                System.out.println("Hoy es virnes");

                break;
            default:
            System.out.print("\nLo siento, la opcion elegida no es correcta.");

                break;
        }
        if (semana==1){
            System.out.print("\nTienes la Asignatura de Programación");
        }else if(semana==2){
            System.out.print("\nTienes la Asignatura le LM");
        }else if(semana==3){
            System.out.print("\nTienes la Asignatura de BBDD");
        }else if (semana==4){
            System.out.print("\nTienes la Asignatura de ED");
        }else if(semana==5){
            System.out.print("\nTienes la Asignatura de Programacion");
        }else{
            System.out.print("\nNo tienes clases este dia");
        }
    }

}