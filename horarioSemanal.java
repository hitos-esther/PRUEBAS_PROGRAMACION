public class horarioSemanal{
    public static void main(String[] args) {
        int fila;
        int columna;
        final String PROG = "\030[0m";
        final String LM = "\031[7m";
        final String BBDD = "\032[7m";
        final String ED = "\033[7m";
        final String SINF = "\034[7m";
       


        /*System.out.println("Quieres saber a que hora te toca clase?");
        /*System.out.println("Introduce el numero de la asignatura, ");
        int horas = Integer.parseInt(System.console().readLine());*/
        /*String[][] horas = new String[6][5];*/
        String[][] horas = {{"Lunes ","LM ","BBDD ","ED ","SINF "},
                            {"PROG","LM","BBDD","ED","SINF"},
                            {"PROG","LM","BBDD","ED","SINF"},
                            {"PROG","LM","BBDD","ED","SINF"},
                            {"PROG","LM","BBDD","ED","SINF"},
                            {"PROG","LM","BBDD","ED","SINF"},
                            {"PROG","LM","BBDD","ED","SINF"},};
        System.out.println("de que asignatura quieres saber el horario");
        String deseoUsuario=System.console().readLine();
        for(fila = 0; fila < 6; fila++) {
           
            for(columna = 0;columna <5; columna ++){

                if(deseoUsuario.equals(horas[fila][columna])){
                System.out.print(horas[fila][columna]);
                }else{
                    System.out.print(" . ");
                }
            }
            System.out.println(); 
        }
     
    }
} 