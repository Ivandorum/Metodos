public class Veredicto {
   private void v(String num1, String num2) {
           if (num1.equals(num2)) {
               System.out.println("Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.");
           } else if (Integer.valueOf(num1) > Integer.valueOf(num2)) {
               System.out.println("Poco tiempo de estudio. Debes dedicar más tiempo.") ;
           } else {
               System.out.println("Ideal. Trabajas los contenidos en casa.");
           }

   }
}
