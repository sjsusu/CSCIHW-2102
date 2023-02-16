
public class Data {
   /**
    * Computes the average of the measures of the given objects.
    * 
    * @param objects an array of Measurable objects
    * @return the average of the measures
    */
   public static double average(Measurable[] objects) {
      double sum = 0; 
      int count = 0; 
      double limit = 1000;

      for (Measurable obj : objects) {
         if (obj instanceof BankAccount) {
            BankAccount objb = (BankAccount) obj;
            
            if (objb.Accept(limit)) {
               sum = sum + obj.getMeasure();
               count++;
            }

         } else {
            sum = sum + obj.getMeasure();
            count++;

         }
      }

      if (count > 0) {
         return sum / count;

      } else {
         return 0;

      }

   }
}
