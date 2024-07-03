package krista;

public class IntegerNumber extends Number {
   public Integer value;

   public IntegerNumber(String value) {
      this.value = Integer.parseInt(value);
   }

   public IntegerNumber(Integer value) {
      this.value = value;
   }

   public FractionNumber toFraction() {
      return new FractionNumber(value, 1);
   }

   public String toString() {
      return value.toString();
   }
}
