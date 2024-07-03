package krista;

public abstract class FractionOperation extends Operation {
   FractionNumber firstOperand, secondOperand;

   public FractionOperation(Number first, Number second) {
      firstOperand = (FractionNumber) first;
      secondOperand = (FractionNumber) second;
   }

   public abstract Number calculate();
}
