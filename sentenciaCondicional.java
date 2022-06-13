public class sentenciaCondicional {
    
    public static void main(String[] args) {
      
      System.out.println("Cuantos anos tienes?");
      Integer edad = Integer.parseInt( System.console().readLine());
      if (edad >= 18){
        System.out.println("Es mayor de edad porque tiene "+edad+ " anos");
      }else {
        System.out.println("Es menor de edad porque tiene "+edad+ " anos");
      }
      }
      
  }