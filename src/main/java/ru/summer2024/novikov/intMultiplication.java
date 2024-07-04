package ru.summer2024.novikov;

public class intMultiplication extends IntOperation {
   public intMultiplication(Number first, Number second) {
      super(first, second);
   }

   @Override
   public Number calculate() {
      return new IntegerNumber(firstOperand.value * secondOperand.value);
   }
}