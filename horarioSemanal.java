public class horarioSemanal{

    public static void main(String[] args) {
        int fila;
        int columna;
        
       


        /*System.out.println("Quieres saber a que hora te toca clase?");
        /*System.out.println("Introduce el numero de la asignatura, ");
        int horas = Integer.parseInt(System.console().readLine());*/
        /*String[][] horas = new String[6][5];*/
      
        String[][] horas = { 
                            {"PROG" ,"PROG" ,"LM" ,"BBDD", "FOL"},
                            {"PROG","PROG","SINF","BBDD","FOL"},
                            {"ED","PROG","SINF","BBDD","FOL"},
                            {"LM","BBDD","SINF","PROG","SINF"},
                            {"LM","BBDD","ED","PROG","SINF"},
                            {"LM","BBDD","ED","PROG","SINF"}
                        };
        System.out.println("Que asignatura quieres saber el horario");
        String deseoUsuario=System.console().readLine();

         
        for(fila = 0; fila < 5; fila++) {
           
            for(columna = 0;columna <5; columna ++){
                
                if(deseoUsuario.equals(horas[fila][columna])){
                       
                    System.out.printf("|%5s",horas[fila][columna]);
                }else{
                    System.out.printf("|%5s"," X ");
                }
               
            }
            System.out.println();
        }
         
    }
} 