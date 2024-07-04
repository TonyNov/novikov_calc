package ru.summer2024.novikov;

public class FractionMultiplication extends FractionOperation {
   public FractionMultiplication(Number first, Number second) {
      super(first, second);
   }

   public Number calculate() {
      return new FractionNumber(firstOperand.a * secondOperand.a,
            firstOperand.b * secondOperand.b);
   }
}
