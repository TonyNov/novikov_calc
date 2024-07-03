package krista;

public class FractionSubstraction extends FractionOperation {
   public FractionSubstraction(Number first, Number second) {
      super(first, second);
   }

   public Number calculate() {
      return new FractionNumber(firstOperand.a * secondOperand.b - secondOperand.a * firstOperand.b,
            firstOperand.b * secondOperand.b);
   }
}
