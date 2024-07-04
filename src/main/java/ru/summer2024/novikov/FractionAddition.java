package ru.summer2024.novikov;

public class FractionAddition extends FractionOperation {
   public FractionAddition(Number first, Number second) {
      super(first, second);
   }

   @Override
   public Number calculate() {
      return new FractionNumber(firstOperand.a * secondOperand.b + secondOperand.a * firstOperand.b,
            firstOperand.b * secondOperand.b);
   }
}