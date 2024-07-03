package krista;

public class intSubstraction extends IntOperation {
   public intSubstraction(Number first, Number second) {
      super(first, second);
   }

   @Override
   public Number calculate() {
      return new IntegerNumber(firstOperand.value - secondOperand.value);
   }
}
