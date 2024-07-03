package krista;

public class FractionDivision extends FractionOperation {
   public FractionDivision(Number first, Number second) {
      super(first, second);
   }

   public Number calculate() {
      return new FractionNumber(firstOperand.a * secondOperand.b,
            firstOperand.b * secondOperand.a);
   }
}
