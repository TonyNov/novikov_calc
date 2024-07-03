package krista;

public class intDivision extends IntOperation {
   public intDivision(Number first, Number second) {
      super(first, second);
   }

   @Override
   public Number calculate() {
      return new IntegerNumber(firstOperand.value / secondOperand.value);
   }
}