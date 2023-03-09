/**
 * Interfaces with MathOperations.
 * @author John Park
 * @version 1.0
 * @since 02/11/2022
*/
class MathMethods implements MathOperations {
   /**
   * Overrides add() from MathOperations to add.
   * @Override add() from MathOperations
   * @param dNum1 double from UsingMath
   * @param dNum2 double from UsingMath
   * @return dNum1 + dNum2
   */
   @Override 
   public double add(double dNum1, double dNum2) {
      return (dNum1 + dNum2);
   }
   /**
   * Overrides absoluteValue() from MathOperations to abs value.
   * @Override absoluteValue() from MathOperations
   * @param dNum double from UsingMath
   * @return abs value of dNum
   */
   public double absoluteValue(double dNum) {
      return Math.abs(dNum);
   }
   /**
   * Overrides isEven() from MathOperations to check for even.
   * @Override isEven() from MathOperations
   * @param iNum int from UsingMath
   * @return true or false
   */
   @Override 
   public boolean isEven(int iNum) {
      return iNum % 2 == 0;
   }

} //closes class
